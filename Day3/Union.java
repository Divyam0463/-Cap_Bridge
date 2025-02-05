public class Union {
  static void Uni(int[] arr1 , int[] arr2){
    int ans[] = new int[arr1.length +arr2.length]; 

    int i = 0 , j= 0 ,k = 0; 

    while (i<arr1.length) {
      boolean isDup = false;
      
      for (int l = 0; l < ans.length; l++) {
        if (arr1[i] == ans[l]) {
          isDup = true; 
          break ; 
        }
      }
      if (!isDup) {
        ans[k++]=arr1[i];
      } i++;
    }
    while (j<arr2.length) {
      boolean isDup = false;
      
      for (int l = 0; l < ans.length; l++) {
        if (arr2[j] == ans[l]) {
          isDup = true; 
          break ; 
        }
      }
      if (!isDup) {
        ans[k++]=arr2[j];
      } j++;
    }
    for (int m = 0; m < k; m++) {
      System.out.print(ans[m]+" ");
    }
  }
  public static void main(String[] args) {
    int [] arr1 = {1,2,3} ; 
    int arr2[] = {4,5,2} ; 

    Uni(arr1 , arr2) ; 
  }
}
