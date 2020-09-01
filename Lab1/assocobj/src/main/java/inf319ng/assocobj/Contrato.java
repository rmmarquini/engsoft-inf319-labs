package inf319ng.assocobj;

public class Contrato {
	
	private Companhia companhia;
	private Pessoa colaborador;
	private double salario;
	
	public Contrato(Companhia nCompanhia, Pessoa nColaborador, double salario) {
		this.companhia = nCompanhia;
		this.colaborador = nColaborador;
		this.salario = salario;
	}
	
	public Companhia getCompanhia() {
		return companhia;
	}
	
	public Pessoa getColaborador() {
		return colaborador;
	}
	
	public double getSalario() {
		return salario;
	}

}
