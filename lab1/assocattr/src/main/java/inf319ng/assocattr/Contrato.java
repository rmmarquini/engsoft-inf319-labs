package inf319ng.assocattr;

public class Contrato {
	
	private Companhia nomeCompanhia;
	private Pessoa colaborador;
	private double salario;
	
	public Contrato(Companhia nCompanhia, Pessoa nColaborador, double salario) {
		this.nomeCompanhia = nCompanhia;
		this.colaborador = nColaborador;
		this.salario = salario;
	}
	
	public Companhia getCompanhia() {
		return nomeCompanhia;
	}
	
	public Pessoa getColaborador() {
		return colaborador;
	}
	
	public double getSalario() {
		return salario;
	}
	
}
