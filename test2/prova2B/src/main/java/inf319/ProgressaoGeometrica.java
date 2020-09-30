package inf319;

public class ProgressaoGeometrica extends Progressao {

	private long valInicio;
	private long base;

	public ProgressaoGeometrica() {
		this(1, 2);
	}

	public ProgressaoGeometrica(long valInicio) {
		this(valInicio, 2);
	}

	public ProgressaoGeometrica(long valInicio, long base) {
		this.valInicio = valInicio;
		this.base = base;
		inicia();
	}

	public long inicia() {
		valCor = valInicio;
		return valCor;
	}
	
	@Override
	public long inicia(int valInicio) {
		this.valInicio = valInicio;
		return inicia();
	}
	
	@Override
	public long inicia(int valInicio, int base) {
		this.valInicio = valInicio;
		this.base = base;
		return inicia();
	}

	public long proxTermo() {
		valCor *= base;
		return valCor;
	}


}
