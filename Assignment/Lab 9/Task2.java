public class Task2{
  public static void main(String[]args){
    int n=12345;
    reverseDigits(n);
  }
  public static void reverseDigits(int num){
    if(num==0){
      return;
    }
    else{
      System.out.println(num%10);
      reverseDigits(num/10);
    }
  }
}