package exercicios.questao6;

public class PersonLegal extends Person {
    String cnpj;

    PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid() {
        System.out.println("Validando pessoa jurídica: " + cnpj);
        return false;
    }

    @Override
    public String toString() {
        return "CNPJ: " + cnpj;
    }

}
