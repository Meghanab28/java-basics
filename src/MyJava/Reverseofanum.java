package MyJava;
import java.util.*;
public class Reverseofanum {
 public static  void main(String args[]){
	        Scanner sc= new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	        while(n > 0){
	            int lastDigit =n%10;
	            System.out.print(lastDigit + "");
	            n = n / 10;
	        }
	    }


}
