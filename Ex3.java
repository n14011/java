import java.util.Scanner;

abstract class Ex {
	abstract void execute();
}

class Ex3_0 extends Ex{
	void execute(){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if(n > 0){
			System.out.println("その値は正です。");
		}
	}
}

class Ex3_1 extends Ex{
    void execute(){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("整数値:");
    int n = stdIn.nextInt();
    int abs_num = Math.abs(n);
    System.out.println("絶対値:"+abs_num);
    }
}
public class Ex3 {
	public static void main(String[] args){
		Ex a;
		a = new Ex3_0();
		a.execute();
		a = new Ex3_1();
		a.execute();
	}
}
