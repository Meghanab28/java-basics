package MyJava;
	import java.util.*;

public class Averageval {
	public static double average(double x, double y, double z){
	  return ( x+ y+ z)/3;
	}
	public static void main(String [] args){
	    Scanner sc= new Scanner(System.in);
	    System.out.print("input the first number: ");
	    double x = sc.nextDouble();
	    System.out.print("input the second number: ");
	    double y = sc.nextDouble();
	    System.out.print("input the third number: ");
	    double z = sc.nextDouble();
	System.out.print("the average value is " + average(x,y,z));
sc.close();
	}

	}
