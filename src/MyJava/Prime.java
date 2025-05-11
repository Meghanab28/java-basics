package MyJava;
import java.util.*;
public class Prime {
	 public static void main(String args[]) {
	        System.out.print("Enter a number :");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        if(n==2){ // 2 is prime so we should write separately
	            System.out.println("n is prime");
	        }else{
	            boolean isPrime = true;  //storing true in boolean
	            for (int i = 2; i<=n-1; i++) {
	                //code optimization
	                // i<=Math.sqrt(n); this reduces time complexity so as to find primes for big numbers
	                if (n % i == 0) {       //n is a multiple of i( i not equal to 1 or n)
	                    isPrime = false;
	                }
	            }
	            if (isPrime == true) {
	                System.out.println("n is prime");
	            } else {
	                System.out.println("n is not prime");
	                sc.close();
	            }
	        }
	    }
}

//USING FUNCTIONS
//public static boolean isPrime(int n){
//    if(n ==2){
//        return true;
//    }
//    for(int i=2; i<=n-1; i++){ //Math.sqrt(n)
//        if(n % i == 0){
//            return false;
//        }
//    }
//    return true;
//}
//public static void main(String args[]){
//    Scanner sc= new Scanner(System.in);
//    int n=sc.nextInt();
//    System.out.println(isPrime(n));
//}
//}
