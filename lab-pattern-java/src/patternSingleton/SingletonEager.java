package patternSingleton;

/**
 * Singleton "Apressado"
 *
 * @outhor rafaelrok
 *
 */

public class SingletonEager {

    //Sendo atribuida instanciando no começo do programa
    private static SingletonEager instance = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
