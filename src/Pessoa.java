public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    // CONSTRUTOR 1 - PADRÃO
    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // CONSTRUTOR 2 - COM PARÂMETROS
    public Pessoa(String nome) {
        if (nome == null) {
            this.nome = "João";
        } else {
            this.nome = nome;
        }
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        if (nome.length() < 20) {
            this.nome = nome;
        } else {
            this.nome = "Nome inválido!";
        }
    }

    public String formatarDados() {
        return "Eu, " + nome + " de CPF nº " + cpf + ", residente na rua " +
                endereco + " tenho" + idade + " anos";
    }

}
