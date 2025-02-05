class Second_lar {

  static int find_Sec(int[] arr) {

    int max = Integer.MIN_VALUE, idx = 0;
    int second_max = Integer.MIN_VALUE;

    if (arr.length == 1) {
      return arr[0];
    }

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > max){
      max = arr[i]; // finding the largest 
      idx = i; // storing the index
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > second_max && i != idx)
        second_max = arr[i];
    }

    if (arr.length == 0) {
      return 0;
    }

    return second_max;

  }

  public static void main(String[] args) {
    int[] arr = { 47 };
    System.out.println(find_Sec(arr));
  }
}
