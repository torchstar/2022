package singletion;

/**
 * @author torchstar
 * @date 2022年06月04日 20:59
 */
public class MyHungrySingleton {
    private static final MyHungrySingleton myHungrySingleton = new MyHungrySingleton();

    private MyHungrySingleton(){}

    private MyHungrySingleton getInstance(){
        return myHungrySingleton;
    }
}
