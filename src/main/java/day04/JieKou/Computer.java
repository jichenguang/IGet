package day04.JieKou;

/**
 * Created by Simba on 2016/3/26.
 */
public class Computer {

    public void useUSB(IUSB iusb){
        //System.out.println("我的工作模式是："+iusb.getClass().getName().toString());
        iusb.start();
        iusb.stop();
    }
}
