package MyJava;

public class Overloading {

	//function overloading with parameters
	
//	    public static int sum(int a, int b){
//	        return a+b;
//	    }
//	    public static int sum(int a, int b, int c){
//	        return a+b+c;
//	    }
//	    public static void main(String[] args){
//	       System.out.println(sum(3, 5));
//	        System.out.println(sum(8, 5, 5));
//	    }
	//}
	public static int sum(int a, int b){
	return a+b;
	}
	    public static float sum(float a, float b){
	    return a+ b;
	    }
	    public static void main(String []args){
	        System.out.println(sum(3, 8));
	        System.out.println(sum(1.2f, 5.5f));
	}
	}

