package enjoy.patterns.create.factory.product;

import enjoy.patterns.action.visit.Visit;

/**
 * @Author: lijunlei
 * @Date: 2019/3/28 1:14
 * @Description: 水果接口
 */
public interface Fruit {
    int price();

    void draw();

    int accept(Visit visit);
}
