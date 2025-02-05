class methods_var
{
  private long accNumber  ; 
  private String accHolderName ; 
  private long accBalance ; 

  void add_Amount(long amt){
    this.accBalance += amt ; 
  }  

  void withdraw_Amount(long amt){
     this.accBalance -= amt ; 
  }

  void checkBalance(){
     System.out.println("Balance is: " + accBalance ) ; 
  }

  public static void main(String[] args){

    methods_var obj = new methods_var() ; 
    obj.add_Amount(1000) ;
    obj.withdraw_Amount(100) ; 

    obj.checkBalance() ;    
  }
}
