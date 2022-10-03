package patterns.observer;

import patterns.observer.models.Revista;

public interface Editora {
    public void criarRevista(String titulo);

    public void registrarAssinante(Assinante assinante);

    public void removerAssinante(Assinante assinante);

    void notificarNovaEdicaoDaRevista(Revista revista);
}