import java.util.ArrayList;

class Ex4{

    public int [] ex4_1(int [] a){
        for(int i = 0; i < a.length-1; i++){
                for(int j = i+1; j < a.length; j++){
                    if(a[j] < a[i]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

        return a;

    }

    public int [] ex4_2(int [] a){
            for(int i = 0; i < a.length-1; i++){
                for(int j = i+1; j < a.length; j++){
                    if(a[j] > a[i]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

        return a;

    }

    public String [] ex4_3(int [] a){


            String [] hantei = {"負","零","正"};
            String [] b=new String[a.length];
            for(int i=0;i<a.length;i++){
            if(a[i]>0){
            b[i] =hantei[2];
            }else if(a[i]<0){
            b[i] =hantei[0];
            }else{
            b[i]=hantei[1];
            }
            }
            return b;
    }

    public int ex4_4(int a){
       int keta=0;
        while(0<a){
        a /= 10;
        keta++;
        }
    return keta;
}
    public int ex4_5(int a){
        int sum = 0;
        for(int i =0;i<a+1;i++){
            sum+=i;
        }

        return sum;

    }

    public int [] ex4_6(int a){

        int [] ret = new int[1];
/*        for(int i =1;i<a.length;i++){
            if(a%i==0){
                i++;
            }

        }*/

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
