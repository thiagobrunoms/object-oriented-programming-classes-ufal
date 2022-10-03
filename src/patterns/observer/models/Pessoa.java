package patterns.observer.models;

public abstract class Pessoa {
    protected String nome;
    protected String matricula;

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

}
