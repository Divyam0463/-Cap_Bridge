
import java.util.Scanner;

public class perimeter_Rec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter the length and width of rectangle: ");

    int length = s.nextInt() ; 
    int width = s.nextInt() ; 

    double perimeter = 2 * (length + width) ; 
    System.out.println(perimeter);
  }
  
}
