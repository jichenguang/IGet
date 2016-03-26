package day03.Student;

/**
 * Created by JiChenGuang on 16/3/19.
 */
public class testStudent {
    public static void main(String[] args) {
        Student stu = new Student("liming",13);
        System.out.println(stu.getTotalNo());
//        stu.name;
        stu.speak();
    }
}
