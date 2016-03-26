package day03.Animal;

/**
 * Created by JiChenGuang on 16/3/19.
 * 子类覆盖父类方法
 */
public class subDog extends  Animal{

        private String name;
        private int age;
        //动物都会叫唤
        public void cry() {
            System.out.println("狗狗叫的声音是汪汪汪");
        }


}
