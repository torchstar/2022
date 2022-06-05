package singletion;

/**
 * @author torchstar
 * @date 2022年06月05日 0:14
 */
public class LazySimpleSingletion {

    private static LazySimpleSingletion instance;

    private LazySimpleSingletion(){}

    public synchronized static LazySimpleSingletion getInstance(){
        if(instance == null){
            instance = new LazySimpleSingletion();
        }
        return instance;
    }
}
