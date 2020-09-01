package inf319ng.assocbid;

/**
 * @author esoft38 - Rafael Mardegan Marquini
 */

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private double salario;
	private Companhia emprego;
	
	public Pessoa() {
		nome = "";
		sobrenome = "";
		salario = 0.0;
		emprego = null;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = "";
		this.sobrenome = "";
		this.salario = 0.0;
		this.emprego = null;
	}
	
	public void emprega(Companhia companhia, double salario) {
		this.emprego = companhia;
		this.salario = salario;
	}
	
	public void demitese() {
		this.emprego = null;
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
