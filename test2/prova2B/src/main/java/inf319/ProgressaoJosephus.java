package inf319;

public class ProgressaoJosephus extends Progressao {

	private int size;
	private int step;
	private boolean[] circle;
	private long alive;

	public ProgressaoJosephus() {
		this(41, 2);
	}
	
	public ProgressaoJosephus(int step) {
		this(41, step);
	}

	public ProgressaoJosephus(int size, int step) {
		this.size = size;
		this.step = step;
		inicia();
	}

	public long inicia() {
		circle = new boolean[size];
		circle[0] = false;
		for (int i = 1; i < size; i++) {
			circle[i] = true;
		}
		alive = size - 1;
		valCor = 0;
		return valCor;
	}
	
	@Override
	public long inicia(int size) {
		this.size = size;
		return inicia();
	}

	@Override
	public long inicia(int size, int step) {
		this.size = size;
		this.step = step;
		return inicia();
	}

	public long proxTermo() {
		if (alive == 0) {
			return 0;
		}
		for (int i = 0; i < step; i++) {
			do {
				valCor = (valCor + 1) % size;
			} while (!circle[(int) valCor]);
		}
		circle[(int) valCor] = false;
		alive--;
		return valCor;
	}

}
