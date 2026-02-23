//Task 5
import java.util.Scanner;
public class Task5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int end = input.length();
    for (int i= end - 1; i >= 0; i--){
      char ch=input.charAt(i);
      if (ch == ' '){
        for (int j = i + 1; j < end; j++){
          System.out.print(input.charAt(j));
        }
        System.out.print(" ");
        end = i;
      }
    }
    for (int i = 0; i < end; i++){
      System.out.print(input.charAt(i));
    }
    System.out.println();
  }
}
    
        
        
      


        