package inf319ng.assocattr;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private Contrato contratoTrabalho;
	
	public Pessoa() {
		nome = "";
		sobrenome = "";
		contratoTrabalho = null;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = "";
		this.sobrenome = "";
		this.contratoTrabalho = null;
	}
	
	public Companhia getEmprego() {
		if (contratoTrabalho == null) 
			return null;
		return contratoTrabalho.getCompanhia();
	}
	
	public double getSalario() {
		if (contratoTrabalho == null) 
			return 0.0;
		return contratoTrabalho.getSalario();
	}
	
	public void emprega(Contrato contratoTrabalho) {
		if (contratoTrabalho == null)
			this.contratoTrabalho = contratoTrabalho;
	}
	
	public void demite() {
		contratoTrabalho = null;
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
