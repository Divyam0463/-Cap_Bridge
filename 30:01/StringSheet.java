
import java.util.Arrays;






public class StringSheet {
  // static void check(String str) {
  // int cnt = 1;

  // char[] arr = str.toCharArray();
  // Arrays.sort(arr);

  // for (int i = 0; i < arr.length-1; i++) {

  // if (arr[i] != arr[i + 1]) {
  // System.out.println(arr[i] + " counted times: " + cnt);
  // cnt=1;
  // } else {
  // cnt++;
  // }

  // }System.out.println(arr[arr.length-1] + " counted times: " + cnt);
  // }

  // 2

  // static void check1(String str){
  // int cntL=0 , cntC = 0 ,cntS= 0 , cntD = 0 ;
  // for (int i = 0; i < str.length(); i++) {
  // if (str.charAt(i) >= 97 && str.charAt(i) <= 122) cntL++;

  // else if(str.charAt(i) >= 65 && str.charAt(i) <= 90) cntC++ ;

  // else if(str.charAt(i) >='0' && str.charAt(i)<='9') cntD++; //we r comparing
  // characters here

  // else{
  // cntS++;
  // }
  // }
  // System.out.println("Small: "+cntL+" Capital: "+cntC+ " Digits: "+cntD+"
  // Special:"+cntS);
  // }

  // 3

  // static boolean check3Panagram(String str) {
  //   str = str.toLowerCase().replaceAll("\\s", "");
    
  //   if (str.length()<26) {
  //     return false ; 
  //   }
  //   for(int ch = 'a' ; ch <= 'z' ;ch++ ){
  //     if (str.indexOf(ch) < 0) {
  //       return false ; 
  //     }
  //   }return true; 
  // }
  
  //4

  static boolean check4Anagram(String s1, String s2){

    if (s1.length() != s2.length()) {
      return false ;
    }
    char [] c1 = s1.toCharArray() ; 
    char [] c2 = s2.toCharArray() ;
    
    Arrays.sort(c1) ; 
    Arrays.sort(c2) ; 

    return Arrays.equals(c1 , c2) ; 
  }

  public static void main(String[] args) {
    String str = "The quick bown fox jumps over the lazy .";
    // System.out.println(str.indexOf('G')); // not present characters will return -1..
    // System.out.println(check3Panagram(str));

    String s1 ="silent" ; 
    String s2 = "listen" ; 

    System.out.println(check4Anagram(s1, s2));

  }
}
