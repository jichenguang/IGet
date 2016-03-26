package day03.Human;


/**
 * Created by JiChenGuang on 16/3/19.
 */
public class Pupil extends Human {
    private String studentNo;
    private String name;
    private char gender;
    private int age;




    public Pupil(String studentNo) {
        System.out.println("Pupil none con");
    }



    public Pupil(String studentNo, String name, char gender, int age) {
        super(name, gender, age);  //super用来调用父类构造方法，必须是第一句
        this.studentNo= studentNo;
        System.out.println("Pupil....");
    }



    protected String getName() {
        return name;
    }


    public void learn() {
        System.out.println(this.getName() + "在学习。。。");
    }




}
