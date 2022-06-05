package singletion;

/**
 * @author torchstar
 * @date 2022年06月05日 9:35
 * description 优点：写法优雅，利用了java本身语法特点，性能高，避免了内存浪费
 *              缺点：能够被反射破坏（可解决，写法不优雅）
 */
public class LazyStsticInnerClassSingleton {
    private LazyStsticInnerClassSingleton(){
//        if(LazyHolder.INSTANCE != null){
//            throw new RuntimeException("不允许非法访问！！！");
//        }
    }

    private static LazyStsticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStsticInnerClassSingleton INSTANCE = new LazyStsticInnerClassSingleton();
    }
}
