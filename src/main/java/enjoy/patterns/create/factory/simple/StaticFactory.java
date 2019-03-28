package enjoy.patterns.create.factory.simple;

import enjoy.patterns.entity.Fruit;
import enjoy.patterns.entity.fruit.Apple;
import enjoy.patterns.entity.fruit.Banana;
import enjoy.patterns.entity.fruit.Orange;

/**
 * @Description: 简单工厂模式 --- 静态工厂模式
 * @Author: lijunlei
 * @CreateDate: 2019/3/28 13:20
 */
public class StaticFactory {
    public static final int TYPE_APPLE=1;//苹果
    public static final int TYPE_ORANGE=2;//桔子
    public static final int TYPE_BANANA=3;//香蕉

    public static Fruit getFruit(int type){
        if(TYPE_APPLE == type){
            return new Apple();
        }else if(TYPE_ORANGE ==type){
            return new Orange(80,"Peter");
        }else if(TYPE_BANANA == type){
            return new Banana();
        }
        return null;
    }

    /**
     * 多方法工厂
     */
    public static Fruit getFruitApple(){return new Apple();}
    public static Fruit getFruitOrange(){return new Orange(80,"Peter");}
    public static Fruit getFruitBanana(){return new Banana();}
}
