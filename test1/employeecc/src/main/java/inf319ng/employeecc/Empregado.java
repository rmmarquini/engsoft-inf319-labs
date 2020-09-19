package inf319ng.employeecc;

/**
 * Escreva a sua avaliacao do projeto atual. Seja conciso e preciso.
 * 
 * @author esoft38 - Rafael Mardegan Marquini
 * > Acredito que ter uma classe para cada tipo de cargo seja complicado dar 
 * escalabilidade para a aplicação. Com isso, o ideal seria existir uma classe mais
 * genérica para informar o tipo do cargo.
 * Um segundo ponto que observei é que o cálculo do salário pode ser realizado em
 * outra classe distinta, e assim, utilizarmos os getters e setters padrões.
 * 
 * ...
 * Adicione novos comentarios para explicar a sua melhoria.
 * 
 * Empregando polimorfismo 
 * ...
 * @author INF319
 */
public class Empregado {

    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double salario() {
    	return salario;
    }
}
