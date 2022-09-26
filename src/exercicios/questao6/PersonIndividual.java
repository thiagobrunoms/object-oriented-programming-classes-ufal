package exercicios.questao6;

public class PersonIndividual extends Person {
    String cpf;

    PersonIndividual(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean isValid() {
        System.out.println("Validando pessoa fisica: " + cpf);
        return true;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf;
    }

}
