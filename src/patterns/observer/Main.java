package patterns.observer;

import patterns.observer.models.Aluno;
import patterns.observer.models.EditoraUFAL;
import patterns.observer.models.Professor;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123");
        Professor professor = new Professor("João", "123");

        EditoraUFAL editoraUFAL = new EditoraUFAL();
        editoraUFAL.registrarAssinante(aluno);
        editoraUFAL.registrarAssinante(professor);

        editoraUFAL.criarRevista("De volta às aulas!");
    }

}
