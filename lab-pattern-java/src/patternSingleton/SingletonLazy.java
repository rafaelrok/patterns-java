package patternSingleton;

/**
 * Singleton "lazy"
 *
 * @outhor rafaelrok
 *
 */

public class SingletonLazy {

    private static SingletonLazy instance;

    public SingletonLazy() {
        super();
    }
    //metodo que instacia a propria classe
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
