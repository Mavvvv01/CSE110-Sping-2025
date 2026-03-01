public class Task1{
  public static void main(String[]args){
    int num = -53;
    evenChecker(num);
    boolean result1 = isEven(num);
    System.out.println(result1);
    boolean result2 = isPos(num);
    System.out.println(result2);
    sequence(num);
  }
    public static void evenChecker(int n){
      if(n%2==0){
        System.out.println("Even!!");
      }else{
        System.out.println("Odd!!");
      }
    }
    public static boolean isEven(int n){
      if(n%2==0){
        return true;
      }else{
        return false;
      }
    }
    public static boolean isPos(int n){
      if(n>0){
        return true;
      }else{
        return false;
      }
    }
    public static void sequence(int n){
      if(isPos(n)==true){
        for(int i = 0; i<=n; i++){
          if(isEven(i)==true){
            System.out.print(i+ " ");
          }
        }
      }else{
        for(int i = 0; i>=n; i--){
          if(isEven(i)==false){
            System.out.print(i+" ");
          }
        }
      }
    }
}

