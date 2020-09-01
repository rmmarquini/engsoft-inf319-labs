package inf319ng.assocobj;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private ContratosDeTrabalho contratosTrabalho;
	
	public Pessoa() {
		setNome("");
		setSobrenome("");
		contratosTrabalho = null;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.setNome("");
		this.setSobrenome("");
		this.contratosTrabalho = null;
	}
	
	public ContratosDeTrabalho getContratoTrabalho() {
		return contratosTrabalho;
	}
	
	public void setContratos(ContratosDeTrabalho contratosTrabalho) {
		this.contratosTrabalho = contratosTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
