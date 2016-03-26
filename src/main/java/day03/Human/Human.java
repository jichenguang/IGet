package day03.Human;

/**
 * Created by JiChenGuang on 16/3/19.
 */
public class Human {
    private String name;
    private char gender;
    private int age;

    public Human(){

    }


    public Human(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public void think() {
        System.out.println(this.name + "在思考。。。");
    }
}