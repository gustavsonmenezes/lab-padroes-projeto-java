package one.digital.innovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author gustavsonmenezes
 */

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;

    }

}
