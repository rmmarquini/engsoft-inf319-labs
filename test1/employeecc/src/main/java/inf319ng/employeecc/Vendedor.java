package inf319ng.employeecc;

public class Vendedor extends Empregado {

	private double comissaoVenda;
	
	public Vendedor() {
		super();
	}

	public double getComissaoVenda() {
		return comissaoVenda;
	}

	public void setComissaoVenda(double comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}
	
	@Override
	public double salario() {
		return super.salario() + this.getComissaoVenda();
	}

}
