package day03.homework;

import java.util.Scanner;

/**
 * Created by JiChenGuang on 16/3/24.
 */
public abstract class Circle extends Shape{

    double area = 0;
    final double PI = 3.14159;//定义圆周率π的值
    double radius;


    public double getArea(){
        System.out.println("请输入圆形的半径：");
        Scanner num = new Scanner(System.in);
        radius = num.nextDouble();
        area = radius*radius*PI;
        return  area;
    }



}
