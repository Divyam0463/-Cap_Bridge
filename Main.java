
class Values {
  public int value ;
  public float digit ; 
  public String str ; 
  public double D ; 
  public boolean B ; 

  // public Values(int value) {
  //   this.value = value ;
  // }//constructor
  public int setValue(int val){
    value = val  ; 
    return val;
  }
  public float setDigit(float digit2){
    digit = digit2 ; 
    return digit2 ; 
  }
  public String setString(String s){
    str= s; 
    return s ; 
  }
  public double setDouble(){
    D = (double) digit ; 
    return D ; 
  }

  public boolean setBoolean (boolean newB){
    B = newB ; 
    return B ; 
  }
}

public class Main{
  public static void main(String[] args) {
      Values obj = new Values() ; 

      System.out.println(obj.setValue(10));

      obj.setDigit(1.8f) ; 

      System.out.println(obj.digit);

      obj.setString("hello");

      System.out.println(obj.str);

      obj.setDouble() ;

      System.out.println(obj.D);

      obj.setBoolean(true) ;
      
      System.out.println(obj.B);
  }
}