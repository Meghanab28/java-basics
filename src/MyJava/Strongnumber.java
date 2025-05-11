package MyJava;

public class Strongnumber {
	public static void main(String []args){
        int num =5;
        int temp = num;             //145  //14    //1
        int sum= 0;
        while(temp > 0){
            int digit= temp % 10;   // digit=5   //4    //1
            int fact =1;
             for(int i=1; i<= digit; i++){
                 fact= fact * i;             //120      //24  //1
             }
             sum= sum+fact;           //0+120+24+1  //145
             temp = temp/10;           //14      //1
        }
        if(sum==num){
            System.out.println("is a strong number");
        }else{
            System.out.println("is not a strong number");
        }
    }
}
