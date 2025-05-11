package MyJava;
//import java.util.*;
public class Functions {
//  public static void printhello() {
//      System.out.println("hello Meghana");
//  }
//  public static int calculatesum(int num1, int num2){ //parameters or formal parameters
//      int sum =num1+num2;
//      return sum;
//  }

//  public static void main(String[] args) {
//      Scanner sc= new Scanner(System.in);
//      int a =sc.nextInt();
//      int b=sc.nextInt();
//      int sum = calculatesum(a,b); //arguments or actual parameters
//      System.out.println("sum is : " + sum);
//      printhello();
//}
//  public static void swap(int a, int b){
//      int temp = a;
//      a = b;
//      b = temp;
//      System.out.println("a = " +a);
//      System.out.println("b = " +b);
//
//  }
//public static void main(String args[]){
//      //swap values
//      int a =5;
//              int b=10;
//              swap(a,b);


public static int multiply(int a,int b){
  int product= a*b;
return product;
}
public static void main(String[] args){
  int a=3;
  int b=5;
 int prod = multiply(a,b);
 System.out.println("a * b = "+prod);
}
  }
