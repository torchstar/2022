package singletion;

/**
 * @author torchstar
 * @date 2022年06月04日 23:54
 */
public class MyStaticHungrySingleton {

    private static final MyStaticHungrySingleton myStaticHungrySingleton;

    static{
        myStaticHungrySingleton = new MyStaticHungrySingleton();
    }

    private MyStaticHungrySingleton(){}

    public MyStaticHungrySingleton getInstance(){
        return myStaticHungrySingleton;
    }
}
