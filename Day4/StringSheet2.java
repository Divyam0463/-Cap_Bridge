public class StringSheet2 {
  static boolean checkRotation(String s1 , String s2){
    if (s1.length() != s2.length()) {
      return false ; 
    }

    char [] c1 = s1.toCharArray() ; 
    char [] c2 = s2.toCharArray() ; 

    int j = 1 ;
    int [] ans = new int[c1.length] ;

    for (int i = 0 ; i<c1.length -1 ; i++) {
      if (i<c1.length - 1) {
          ans[j] = c1[i] ;
          j++ ;  
      }
    }
  
  }

  public static void main(String[] args) {
    
  }
}
