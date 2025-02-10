
import java.util.Scanner;

public class miles_kilo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter distance in miles");
    float miles = s.nextFloat() ; 

    System.out.println("kilometers are : ");
    double kilometers = miles*0.621371 ;

    System.out.println(kilometers);
  }
}
