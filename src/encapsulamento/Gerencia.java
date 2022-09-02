package encapsulamento;

public class Gerencia {

    /*
     * Problema: se t.notas for alterado para outra estrutura de dados,
     * ou se o array "notas" na classe Turma se tornar PRIVADO,
     * a expressão "t.notas.length" pode quebrar.
     */
    public float calcularMediaExemplo1(Turma t) {
        float soma = 0;
        for (int i = 0; i < t.notas.length; i++) {
            soma += t.notas[i];
        }

        return soma / t.notas.length;
    }

    /*
     * Problema: se t.getNotas() passar a retornar OUTRO TIPO DE DADO,
     * a expressão "float[] notas = t.getNotas()" pode quebrar
     */
    public float calcularMediaExemplo2(Turma t) {
        float soma = 0;

        float[] notas = t.getNotas();
        for (int i = 0; i < notas.length; i++) {
            soma += t.notas[i];
        }

        return soma / notas.length;
    }

    /*
     * A solução ideal é DELEGAR o cálculo da média para a classe que possui as
     * notas.
     * Ou seja, delegue o processamento de qualquer atividade para a classe que
     * POSSUI OS DADOS A SEREM PROCESSADOS
     */
    public float calcularMediaExemplo3Ideal(Turma t) {
        float media = t.calcularMedia();

        return media;
    }
}
