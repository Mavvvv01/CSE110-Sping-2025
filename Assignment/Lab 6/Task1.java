//Task2
import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    for(int i=0;i<input.length();i++){
      if(input.codePointAt(i)>=97 && input.codePointAt(i)<=122){
        int lower_case = input.codePointAt(i);
        int higher_case = lower_case-32;
        char higher_letter = (char)higher_case;
        System.out.print((char)higher_case);
      }else{
        System.out.print(input.charAt(i));
      }
    }
  }
}
        