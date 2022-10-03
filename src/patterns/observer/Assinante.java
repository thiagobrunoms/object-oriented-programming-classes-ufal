package patterns.observer;

import patterns.observer.models.Revista;

public interface Assinante {
    public void receberNovaEdicao(Revista revista);
}
