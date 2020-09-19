package inf319ng.employeecc;

public class Gerente extends Empregado {

	private double bonusSucesso;
	
	public Gerente() {
		super();
	}

	public double getBonusSucesso() {
		return bonusSucesso;
	}

	public void setBonusSucesso(double bonusSucesso) {
		this.bonusSucesso = bonusSucesso;
	}
	
	@Override
	public double salario() {
		return super.salario() + this.getBonusSucesso();
	}

}
