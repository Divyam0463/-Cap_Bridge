import java.util.Scanner;

public class Power_calc {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter the base and exponent orderly : ");
    int base = s.nextInt() ; 
    int exponent = s.nextInt() ; 

    double result = Math.pow(base, exponent) ; 

    System.out.println(result);
  }
}
