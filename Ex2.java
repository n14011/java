import java.util.Scanner;
import java.util.Random;

abstract class Ex {
    abstract void execute();
}

class Ex2_0 extends Ex{
    void execute(){
        int x;
        int y;

        x = 63;
        y = 18;

        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");
        System.out.println("合計は" + (x + y) + "です。");
        System.out.println("平均は" + (x + y) / 2 + "です。");
    }
}

class Ex2_1 extends Ex{
    void execute(){

        double x;
        double y;

        x = 63;
        y = 18;

        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");
        System.out.println("合計は" + (x + y) + "です。");
        System.out.println("平均は" + (x + y) / 2 + "です。");


    }

}

class Ex2_2 extends Ex{
    void execute(){
        int x;
        int y;
        int z;

        x = 63;
        y = 18;
        z = 50;

        System.out.println("合計は" + (x + y + z) + "です。");
        System.out.println("平均は" + (x + y + z) / 3 + "です。");
    }
}

class Ex2_3 extends Ex{
    void execute(){
 Scanner stdIn = new Scanner(System.in);


        System.out.print("整数値：");// xの値の入力を促す
        int x = stdIn.nextInt();

        System.out.println(x);


    }
}
class Ex2_4 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);


        System.out.print("整数値：");// xの値の入力を促す
        int x = stdIn.nextInt();


        System.out.println("x + 10 = " + (x + 10)); // x + yの値を表示
        System.out.println("x - 10 = " + (x - 10)); // x - yの値を表示


    }
}
class Ex2_5 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);


        System.out.print("実数値x：");// xの値の入力を促す
        int x = stdIn.nextInt();

        System.out.print("実数値y：");// yの値の入力を促す
        int y = stdIn.nextInt();

        System.out.println("和:" + (x + y)); // x + yの値を表示
        System.out.println("平均: " + (x + y)/2); // x - yの値を表示


    }
}

class Ex2_6 extends Ex{
    void execute(){

        Scanner stdIn = new Scanner(System.in);


        System.out.print("底辺：");// xの値の入力を促す
        double x = stdIn.nextDouble();

        System.out.print("高さ：");// yの値の入力を促す
        double y = stdIn.nextDouble();


        System.out.println("面積 " + (x * y)/2); // x * yの値を表示


    }
}
class Ex2_7 extends Ex{
    void execute(){
        Random rand = new Random();

        int a = rand.nextInt(10);// 0～9の乱数
        System.out.println("random1~10:"+a);
         }
}
public class Ex2 {
    public static void main(String[] args){
        Ex a;
        a = new Ex2_0();
        a.execute();
        a = new Ex2_1();
        a.execute();
        a = new Ex2_2();
        a.execute();
        a = new Ex2_3();
        a.execute();
        a = new Ex2_4();
        a.execute();
        a = new Ex2_5();
        a.execute();
        a = new Ex2_6();
        a.execute();
        a = new Ex2_7();
        a.execute();


    }
}

class Ex2_00 extends Ex{
    void execute(){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("xとyを加減乗除します。");

        System.out.print("xの値：");// xの値の入力を促す
        int x = stdIn.nextInt();

        System.out.print("yの値：");// yの値の入力を促す
        int y = stdIn.nextInt();

        System.out.println("x + x = " + (x + y)); // x + yの値を表示
        System.out.println("x - x = " + (x - y)); // x - yの値を表示
        System.out.println("x * x = " + (x * y)); // x * yの値を表示
        System.out.println("x / x = " + (x / y)); // x / yの値を表示 (商)
        System.out.println("x % x = " + (x % y)); // x % yの値を表示 (剰余)
    }
}

class Ex2_000 extends Ex{
    void execute(){
        Random rand = new Random();

        int luchy = rand.nextInt(10);// 0～9の乱数
        System.out.println("今日のラッキーナンバーは" + luchy + "です。");
    }
}

