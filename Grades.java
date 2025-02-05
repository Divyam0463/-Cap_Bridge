import java.util.* ; 

public class Grades {
  static String checkGrade(int marks){
    if (marks <=75 && marks>40) return "Pass" ; 
    
    else if (marks>75 && marks<=100) return "Distinction" ; 
    
    else{
      return "Fail" ; 
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in) ; 
    System.out.println("Enter your marks: ");
    int marks = s.nextInt() ; 

    System.out.println(checkGrade(marks) ); 
  }
}
