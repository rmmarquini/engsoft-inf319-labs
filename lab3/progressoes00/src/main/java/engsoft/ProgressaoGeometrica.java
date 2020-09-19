package engsoft;

import java.util.HashSet;
import java.util.Set;

public class ProgressaoGeometrica extends Progressao {

	private final int base;
	private Set<Integer> items;
	
	public ProgressaoGeometrica() {
		this.base = 2;
		this.items = new HashSet<Integer>();
	}
	
	public ProgressaoGeometrica(int i) {
		this.base = i;
		this.items = new HashSet<Integer>();
	}
	
	@Override
	public int inicia() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int proxTermo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int iesimoTermo(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String imprimeProgressao(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
