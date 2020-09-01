package inf319ng.assocobj;

import java.util.List;

public class Companhia {
	
	private String nomeCompanhia;
	private ContratosDeTrabalho contratosTrabalho;
	
	public Companhia() {
		nomeCompanhia = "";
		contratosTrabalho = null;
	}
	
	public Companhia(String nCompanhia) {
		this.nomeCompanhia = nCompanhia;
		this.contratosTrabalho = null;
	}

	public String getNome() {
		return nomeCompanhia;
	}

	public void setContratos(ContratosDeTrabalho contratosTrabalho) {
		this.contratosTrabalho = contratosTrabalho;
	}

	public ContratosDeTrabalho getContratosTrabalho() {
		return contratosTrabalho;
	}

	public void emprega(Pessoa colaborador, double salario) throws Exception {
		if (contratosTrabalho != null) {
			contratosTrabalho.emprega(this, colaborador, salario);
		}
	}

	public void demite(Pessoa colaborador) throws Exception {
		if (contratosTrabalho != null) {
			contratosTrabalho.demite(this, colaborador);
		}
	}
	
	/**
	 * O METODO custoTotal AGORA ESTABELECE UMA ASSOCIACAO ENTRE Companhia e Pessoa
	 * ATRAVES DA CLASSE ContratosDeTrabalho, LOGO FOI ESTABELECIDO UM METODO QUE
	 * RETORNA OS CONTRATOS VIGENTES DE COLABORADORES EXCLUSIVOS PARA CADA COMPANHIA,
	 * E ASSIM, EH POSSIVEL DETERMINAR O CUSTO TOTAL DA FOLHA PARA CADA COMPANHIA
	 * SEPARADAMENTE.
	 * @return
	 */
	public double custoTotal() {
		double custoTotal = 0.0;
		
		if (contratosTrabalho == null) return 0.0;
		
		List<Contrato> colaboradoresCompanhia = contratosTrabalho.getColaboradoresDoEmpregador(this);
		if (colaboradoresCompanhia.size() == 0) {
			return 0.0;
		}
		
		for (Contrato contrato : colaboradoresCompanhia) {
			custoTotal += contrato.getSalario();
		}
		
		return custoTotal;
	}

}
