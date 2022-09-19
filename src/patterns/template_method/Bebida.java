package patterns.template_method;

public abstract class Bebida {

    public Bebida() {
        feverAgua();
        preparar();
        servir();
    }

    public void feverAgua() {
        System.out.println("Fervendo água...");
    }

    protected abstract void preparar();

    public void servir() {
        System.out.println("Servindo a bebida");
    }

}
