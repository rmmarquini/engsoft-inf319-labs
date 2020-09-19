package engsoft;

import java.util.HashSet;
import java.util.Set;

public class ProgressaoAritmetica extends Progressao {
	
	private final int increment;
	private Set<Integer> items;
	
	public ProgressaoAritmetica() {
		this.increment = 1;
		this.items = new HashSet<Integer>();
	}
	
	public ProgressaoAritmetica(int i) {
		this.increment = i;
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
