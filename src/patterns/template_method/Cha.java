package patterns.template_method;

public class Cha extends Bebida {

    @Override
    protected void preparar() {
        System.out.println("Preparando o chá!");
    }

}
