package patternSingleton;

/**
 * Singleton "lazy"
 *
 * @outhor rafaelrok
 *
 */

public class SingletonLazyHolder {

    private static class instanceHolder {
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    public SingletonLazyHolder() {
        super();
    }
    //metodo que instacia a propria classe
    public static SingletonLazyHolder getInstance() {
        return instanceHolder.instance;
    }
}
