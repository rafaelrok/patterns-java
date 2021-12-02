import patternFacade.Facade;
import patternSingleton.SingletonEager;
import patternSingleton.SingletonLazy;
import patternSingleton.SingletonLazyHolder;
import patternStrategy.*;

public class patternTest {

    //Teste em memoria dos 3 modelos de singleton Lazy, eager e lazy holder

    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        //Strategy
        BehaviorDefault normal = new BehaviorDefault();
        BehaviorDefender defender = new BehaviorDefender();
        BehaviorAggressive aggressive = new BehaviorAggressive();

        Bot bot = new Bot();
        bot.setBehavior(normal);
        bot.move();
        bot.setBehavior(defender);
        bot.move();
        bot.setBehavior(aggressive);
        bot.move();

        //Facade
        Facade facade = new Facade();
        facade.migrationClient("Rafael", "25957220");
    }
}

