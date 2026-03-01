import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    for(int i=1;i>0;i++){
      int num = sc.nextInt();
      if(num<0){
        break;
      }
      else{
        System.out.println(num*num);
       
    }
    }
  }
}