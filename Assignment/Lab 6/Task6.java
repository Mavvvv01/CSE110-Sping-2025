//Task6
import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int vowelCounter = 0;
    int consCounter = 0;
    for(int i =0; i<input.length();i++){
      char character = input.charAt(i);
      int ascii = input.codePointAt(i);
      if(character == 'a' || character == 'e' || character == 'i' || character == 'o'|| character == 'u'){
        vowelCounter++;
      }else{
        consCounter++;
      }
    }
      if((vowelCounter%3==0)&&(consCounter%5==0)){
        System.out.println("Aaarr! Me Plunder!!");
      }else{
        System.out.println("Blimey! No Plunder!");
      }
  }
}