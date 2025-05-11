package MyJava;

public class Single_Digit_Sum {
	 public static void  main(String [] args){
	        int num=123;
	        int sum =0;
	        while(num>=10){
	            int temp=num;
	            while(temp>0){
	                sum=sum+temp%10;
	                temp=temp/10;
	            }
	            num=sum;
	        }
	        System.out.println("sum of all digits: " +num);
	    }
	
}
