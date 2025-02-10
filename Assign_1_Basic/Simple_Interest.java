import java.util.Scanner;

public class Simple_Interest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter the principal ,rate of Interest ,Time :");
    int principal = s.nextInt() ; 
    int rateOfInterest = s.nextInt() ; 

    int time = s.nextInt() ; 

    double Simple_Interest = principal*rateOfInterest*time / 100 ; 

    System.out.println(Simple_Interest);
  }
}
