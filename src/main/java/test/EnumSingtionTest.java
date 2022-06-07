package test;

import singletion.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @author torchstar
 * @date 2022年06月07日 23:25
 * description 枚举不能用反射创建实例
 * java.lang.IllegalArgumentException: Cannot reflectively create enum objects
 */
public class EnumSingtionTest {
    public static void main(String[] args) {
        //EnumSingleton instance = EnumSingleton.getInstance();
        //instance.setData(new Object());

        Class clazz = EnumSingleton.class;

        try {
            Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);

            constructor.setAccessible(true);
            Object o = constructor.newInstance();

            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
