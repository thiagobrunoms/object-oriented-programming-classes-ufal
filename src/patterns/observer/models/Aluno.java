package patterns.observer.models;

import patterns.observer.Assinante;

public class Aluno extends Pessoa implements Assinante {
    public Aluno(String nome, String matricula) {
        super(nome, matricula);
    }

    public void receberNovaEdicao(Revista revista) {
        System.out
                .println("Aluno com matrícula " + matricula +
                        " recebeu nova edição da revista" + revista.getTitulo());
    }
}
