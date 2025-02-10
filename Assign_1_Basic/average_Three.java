
import java.util.Scanner;

public class average_Three {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Input first ,second and third numbers: ");
    int first = s.nextInt() ; 
    int second = s.nextInt() ; 
    int third = s.nextInt() ; 

    double result = (first+second+third)/3 ; 

    System.out.println(result);
  }
}
