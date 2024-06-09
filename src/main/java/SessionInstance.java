package src.main.java;

public class SessionInstance {

    private static Calculator instance;
    public static Calculator getInstance() { return instance; }
    public static void setInstance(Calculator calculator) { instance = calculator; }
}
