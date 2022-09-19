package patterns.template_method;

public class Cafe extends Bebida {

    @Override
    protected void preparar() {
        System.out.println("Preparando o café!");
    }

}
