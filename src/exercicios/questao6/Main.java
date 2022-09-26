package exercicios.questao6;

public class Main {
    public static void main(String[] args) {
        Person individual = new PersonIndividual("023.434.543-44");
        Person company = new PersonLegal("50.432.345/0001-43");

        Validator validator = new Validator();

        validator.runValidation(individual);
        validator.runValidation(company);
    }
}
