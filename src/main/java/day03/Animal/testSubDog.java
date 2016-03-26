package day03.Animal;

/**
 * Created by JiChenGuang on 16/3/19.
 * 调用子类小狗
 */
public class testSubDog {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        dog1.cry();

        subDog dog2 = new subDog();
        dog2.cry();
    }
}


