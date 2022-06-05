package singletion;

/**
 * @author torchstar
 * @date 2022年06月05日 0:32
 */
public class LazyDoubleCheckSingletion {
    private volatile static LazyDoubleCheckSingletion instance;

    private LazyDoubleCheckSingletion(){}

    public static LazyDoubleCheckSingletion getInstance(){
        //检查是否要阻塞
        if(instance==null){
            synchronized (LazyDoubleCheckSingletion.class){
                //检查是否要创建实例
                if(instance==null){
                    instance = new LazyDoubleCheckSingletion();
                }
            }
        }
        return instance;
    }
}
