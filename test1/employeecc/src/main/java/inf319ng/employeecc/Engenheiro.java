package inf319ng.employeecc;

public class Engenheiro extends Empregado {

	private double comissaoProjeto;
	
	public Engenheiro() {
		super();
	}
	
	public double getComissaoProjeto() {
		return comissaoProjeto;
	}

	public void setComissaoProjeto(double comissaoProjeto) {
		this.comissaoProjeto = comissaoProjeto;
	}
	
	@Override
	public double salario() {
		return super.salario() + this.getComissaoProjeto();
	}

}
