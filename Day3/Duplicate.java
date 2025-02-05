
import java.util.Arrays;


public class Duplicate {
  // static void removeDupH(int [] arr){
  //   HashSet <Integer> set = new HashSet<>() ; 

  //   for(int i = 0 ; i<arr.length;i++){
  //     set.add(arr[i]) ; 
  //   }

  //   Iterator itr = set.iterator() ; //an iterator object for the hashset

  //   while (itr.hasNext()) {
  //     System.out.print(itr.next()+" ");
  //   } 

  static void remove(int [] arr){ 
    int [] ans = new int[arr.length] ; 
    int j = 0 ;

    Arrays.sort(arr) ; 

    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i]!=arr[i+1]) {
        ans[j++]=arr[i];
      }
    }
    ans[j]=arr[arr.length-1] ; 

    for (int i = 0; i <= j; i++) {
      System.out.print(ans[i]+" ");
    }
  }
  

  public static void main(String[] args) {
    int [] arr = {11,2,2,9,10,9,5} ;
    // removeDupH(arr); 
    remove(arr);
  }
}
