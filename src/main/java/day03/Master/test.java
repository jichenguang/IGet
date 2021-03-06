package day03.Master;

/**
 * Created by JiChenGuang on 16/3/19.
 */
public class test {

    /**
     * Created by beigui on 2016/2/11.
     * 功能：多态。主人给不同的动物喂食不同食物
     *                  Master
     *      Food   ---  feed() ---  Animal
     *      / \                      / \
     *     /   \                    /   \
     *    /     \                  /     \
     *  Fish    Bone             Cat     Dog
     *
     *  多态概念：“龙生九子，子子不同” 多态就是同一个处理手段可以用来处理多种不同的情况
     *  手段就是继承或者实现父类的方法，本例中就是showName方法, eat方法
     *
     *  需要注意构造函数，即运行顺序，问的比较多 *****
     */

    public static void main(String[] args) {
        Master master = new Master();
        master.feed(new Dog(), new Bone());
        System.out.println("**********************");
        master.feed(new Cat(), new Fish());
    }
}
