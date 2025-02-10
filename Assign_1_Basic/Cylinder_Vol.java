
import java.util.Scanner;

public class Cylinder_Vol {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter the radius and height: ");
    int rad = s.nextInt() ; 
    int height = s.nextInt() ; 

    double vol  = 3.14 * rad*rad * height ; 

    System.out.println(vol);
  }
}
