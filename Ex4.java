import java.util.ArrayList;

class Ex4{

	public int [] ex4_1(int [] a){
        for(int i = 1; i<a.length-1;i++){
        if(a[0]>a[1]){
        int tmp = a[i];
        a[1] =a[0];
        a[0]=tmp;
        } }
		return a;

	}

	public int [] ex4_2(int [] a){

		return a;

	}

	public String [] ex4_3(int [] a){

		String [] hantei = {"dummy"};

		return hantei;

	}

	public int ex4_4(int a){


		return a;

	}

	public int ex4_5(int a){

		return -1;

	}

	public int [] ex4_6(int a){

		int [] ret = new int[1];

		return ret;

	}

	public boolean ex4_7(int a){

		return false;

	}

	public int ex4_8(int [] a){
		
		int ret = 0;
		
		return ret;

	}

	public int ex4_9(int [] a){
		
		int ret = 0;
		
		return ret;

	}
}

