package inf319;

public class ProgressaoFibonacci extends Progressao {
	
	private long valInicio;
	private long prev;
	private long valPrev;

	public ProgressaoFibonacci() {
		inicia(0, 1);
	}
	
	public ProgressaoFibonacci(long valInicio) {
		this(valInicio, 1);
	}

	public ProgressaoFibonacci(long valInicio, long prev) {
		this.valInicio = valInicio;
		this.prev = prev;
		inicia();
	}

	public long inicia() {
		valCor = valInicio;
		valPrev = prev;
		return valCor;
	}
	
	@Override
	public long inicia(int valInicio) {
		this.valInicio = valInicio;
		this.prev = valPrev;
		return inicia();
	}
	
	@Override
	public long inicia(int valInicio, int prev) {
		this.valInicio = valInicio;
		this.prev = prev;
		return inicia();
	}

	public long proxTermo() {
		valCor += valPrev;
		valPrev = valCor - valPrev;
		return valCor;
	}

}
