//Task3
import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String output = "";
    for(int i =input.length()-1;i>=0;i--){
      output+=input.charAt(i);
    }
    if(output.equals(input)){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }
}
        