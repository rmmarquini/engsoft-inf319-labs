package inf319ng.assoccp;

/**
 * @author esoft38 - Rafael Mardegan Marquini
 */

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Pessoa() {
		nome = "";
		sobrenome = "";
		salario = 0.0;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = "";
		this.sobrenome = "";
		this.salario = 0.0;
	}
	
	public Pessoa(String nome, String sobrenome, double salario) {
		this.nome = "";
		this.sobrenome = "";
		this.salario = 0.0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
