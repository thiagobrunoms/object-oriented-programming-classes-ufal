package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        BancoDeDados banco1 = BancoDeDados.getInstance();
        BancoDeDados banco2 = BancoDeDados.getInstance();

        System.out.println(banco1);
        System.out.println(banco2);
    }
}
