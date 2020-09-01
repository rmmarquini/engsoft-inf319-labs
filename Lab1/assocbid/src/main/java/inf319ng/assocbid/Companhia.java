package inf319ng.assocbid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author esoft38 - Rafael Mardegan Marquini
 */

public class Companhia {
	
	private String nomeCompanhia;
	private Set<Pessoa> colaboradores;
	
	public Companhia() {
		nomeCompanhia = "";
		colaboradores = new HashSet<Pessoa>();
	}

	public Companhia(String string) {
		this.nomeCompanhia = "";
		this.colaboradores = new HashSet<Pessoa>();
	}

	public void emprega(Pessoa colaborador, double salario) {
		if (colaboradores.contains(colaborador))
			return;
		colaborador.emprega(this, salario);
		colaboradores.add(colaborador);
	}
	
	public void demite(Pessoa colaborador) {
		if (colaboradores.contains(colaborador)) {
			colaboradores.remove(colaborador);
			colaborador.setSalario(0.0);
		}
	}

	public double custoTotal() {
		double custoTotal = 0.0;
		Iterator<Pessoa> i = colaboradores.iterator();
		while (i.hasNext()) {
			custoTotal += i.next().getSalario();
		}
		return custoTotal;
	}
	
	public String getNomeCompanhia() {
		return nomeCompanhia;
	}

}
