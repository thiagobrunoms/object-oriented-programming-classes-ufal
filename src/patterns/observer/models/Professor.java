package patterns.observer.models;

import patterns.observer.Assinante;

public class Professor extends Pessoa implements Assinante {
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    public void receberNovaEdicao(Revista revista) {
        System.out.println("Professor " + nome + " recebeu a revista "
                + revista.getTitulo());
    }
}
