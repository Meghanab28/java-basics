package MyJava;

public class Reversethenum {
	//directly reversing the number using rev

	    public static void main(String args[]){
	        int n=668;
	        int rev=0;
	        while(n>0){
	            int lastdigit =n%10;
	            rev= (rev*10) + lastdigit;
	            n = n/10;
	        }
	        System.out.println(rev);
	    }
	}


