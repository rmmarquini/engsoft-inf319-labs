package inf319ng.assoccp;

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
	
	public Companhia(String nomeCompanhia, Set<Pessoa> colaboradores) {
		this.nomeCompanhia = "";
		this.colaboradores = new HashSet<Pessoa>();
	}

	public String getNomeCompanhia() {
		return nomeCompanhia;
	}
	
	public void emprega(Pessoa colaborador, double salario) {
		if (!colaboradores.contains(colaborador)) {
			colaborador.setSalario(salario);
			colaboradores.add(colaborador);
		}
	}
	
	public void demite(Pessoa colaborador) {
		if (colaboradores.contains(colaborador)) {
			colaborador.setSalario(0.0);
			colaboradores.remove(colaborador);
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
	
}
