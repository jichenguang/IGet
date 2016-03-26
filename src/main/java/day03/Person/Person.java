package day03.Person;

/**
 * Created by JiChenGuang on 16/3/19.
 */
public class Person {

        String name;
        int age;
        Person() {}


        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String speak() {
            return "我是" + this.name + ",今年" + this.age + "岁";
        }


}
