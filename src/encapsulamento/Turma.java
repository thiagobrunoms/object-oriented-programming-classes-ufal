package encapsulamento;

public class Turma {

    float[] notas;
    private float[] notasExemplo2;

    public float[] getNotas() {
        return this.notasExemplo2;
    }

    public float calcularMedia() {
        float soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

}
