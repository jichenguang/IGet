package day0102;


/**
 * Created by 700sfriend on 16/3/5.
 */
public class LogicOperators {


    public static void main(String[] args){
        int a = 101;
        int b = 100;

        System.out.println(a > b && a > 99);

        if(a>b && a>90){
            System.out.println("a>99 and a > b  是正确的");

        }


        System.out.println(a>b||a>99);
        if(a>b || a >99){
            System.out.printf("a>99  and  a > b");
        }


    }
}
