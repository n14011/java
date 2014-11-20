class Ex4{

	public int [] ex4_1(int [] a){
        for(int i = 1; i<a.length-1;i++){
        if(a[0]>a[1]){
        int tmp = a[i];
        a[1] =a[0];
        a[0]=tmp;
        }
        }
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
}

