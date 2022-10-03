package patterns.observer.models;

import java.util.ArrayList;

import patterns.observer.Assinante;
import patterns.observer.Editora;

public class EditoraUFAL implements Editora {
    ArrayList<Assinante> listaDeAssinantes;

    public EditoraUFAL() {
        listaDeAssinantes = new ArrayList<Assinante>();
    }

    public void criarRevista(String titulo) {
        Revista novaRevista = new Revista(titulo);
        notificarNovaEdicaoDaRevista(novaRevista);
    }

    public void registrarAssinante(Assinante assinante) {
        listaDeAssinantes.add(assinante);
    }

    public void removerAssinante(Assinante assinante) {
        listaDeAssinantes.remove(assinante);
    }

    public void notificarNovaEdicaoDaRevista(Revista revista) {
        for (Assinante cadaAssinante : listaDeAssinantes) {
            cadaAssinante.receberNovaEdicao(revista);
        }
    }
}
