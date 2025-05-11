package MyJava;
	//Print the loop unit the user enters a multiple of 10
	import java.util.*;
	public class Dowhile {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        do{
	            System.out.print("enter a number :");
	            int n = sc.nextInt();

	            if(n%10 ==0) {
	                break;
	            }
	            System.out.println(n);
	            sc.close();
	        }while(true);
	    }
	}
