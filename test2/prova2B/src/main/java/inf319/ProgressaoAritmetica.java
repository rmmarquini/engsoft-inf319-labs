package inf319;

public class ProgressaoAritmetica extends Progressao {

	private long valInicio;
	private long incremento;

    public ProgressaoAritmetica() {
    	this(0, 1);
    }
    
    public ProgressaoAritmetica(long valInicio) {
        this(valInicio, 1);
    }

    public ProgressaoAritmetica(long valInicio, int incremento) {
    	this.valInicio = valInicio;
    	this.incremento = incremento;
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
    public long inicia(int valInicio, int incremento) {
    	this.valInicio = valInicio;
    	this.incremento = incremento;
    	return inicia();
    }

    public long proxTermo() {
        valCor += incremento;
        return valCor;
    }


}
