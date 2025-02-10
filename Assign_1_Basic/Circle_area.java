
import java.util.Scanner;

public class Circle_area {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter the radius : ");
    double rad = s.nextInt() ; 
    double area = 3.14*rad*rad ;

    System.out.println(area);
  }
}
