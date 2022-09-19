package patterns.singleton;

public class BancoDeDados {
    static private BancoDeDados instance;
    private boolean connected;

    private BancoDeDados() {
        connected = true;
    }

    public static BancoDeDados getInstance() {
        if (instance == null)
            instance = new BancoDeDados();

        return instance;
    }
}
