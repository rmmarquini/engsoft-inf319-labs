package inf319ng.assocattr;

import java.util.HashMap;
import java.util.Map;

public class Companhia {
	
	private String nomeCompanhia;
	private Map<Pessoa, Contrato> contratosTrabalho;
	
	public Companhia() {
		nomeCompanhia = "";
		contratosTrabalho = new HashMap<Pessoa, Contrato>();
	}
	
	public Companhia(String nCompanhia) {
		this.nomeCompanhia = nCompanhia;
		this.contratosTrabalho = new HashMap<Pessoa, Contrato>();
	}
	
	public void emprega(Pessoa colaborador, double salario) {
		Contrato contrato = new Contrato(this, colaborador, salario);
		contratosTrabalho.put(colaborador, contrato);
		colaborador.emprega(contrato);
	}
	
	public void demite(Pessoa colaborador) {
		contratosTrabalho.remove(colaborador);
		colaborador.demite();
	}
	
	public double custoTotal() {
		double custoTotal = 0.0;
		for (Map.Entry<Pessoa, Contrato> contratoTrab : contratosTrabalho.entrySet()) {
			custoTotal += contratoTrab.getValue().getSalario();
		}
		return custoTotal;
	}
	
	public String getNome() {
		return nomeCompanhia;
	}

}
