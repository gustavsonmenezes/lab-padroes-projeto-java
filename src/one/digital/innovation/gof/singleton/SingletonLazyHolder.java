package one.digital.innovation.gof.singleton;

public class SingletonLazyHolder {

    private static class instanceHolder {
            private static SingletonLazyHolder instance = new SingletonLazyHolder();

    }

    private  SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return instanceHolder.instance;
    }

}
