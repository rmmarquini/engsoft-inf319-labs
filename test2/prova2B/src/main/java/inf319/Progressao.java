package inf319;

public abstract class Progressao {

	protected long valCor;

    public abstract long inicia();
    public abstract long inicia(int inicial);
    public abstract long inicia(int inicial, int fator);

    public abstract long proxTermo();

    public long iesimoTermo(int i) {
        long iesimo = inicia();
        for (int j = 0; j < i; j++) {
            iesimo = proxTermo();
        }
        return iesimo;
    }

    public String imprimeProgressao(int n) {
        StringBuilder progressao = new StringBuilder();
        progressao.append(inicia());
        for (int j = 0; j < n; j++) {
            progressao.append(' ');
            progressao.append(proxTermo());
        }
        progressao.append('\n');
        return progressao.toString();
    }

}
