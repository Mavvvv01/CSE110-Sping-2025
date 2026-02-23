import java.util.Scanner;
public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input1 = sc.nextLine();
    String input2 = sc.nextLine();
    String output1 = "";
    String output2 = "";
    for(int i = 0; i<input1.length();i++){
      char in1 = input1.charAt(i);
      boolean common = false;
      for(int j =0; j<input2.length();j++){
        if(in1 == input2.charAt(j)){
          common = true;
          break;
        }
      }
      if(common == false){
        output1+=in1;
      }
    }
    for(int i = 0; i<input2.length();i++){
      char in2 = input2.charAt(i);
      boolean common = false;
      for(int j = 0;j<input1.length();j++){
        if(in2 ==input1.charAt(j)){
          common = true;
          break;
        }
      }
      if(common == false){
        output2+=in2;
      }
    }
    String output = output1+output2;
    
    for(int i =0;i<output.length();i++){
      int lower_case = output.codePointAt(i);
      int higher_case = lower_case-32;
      char higher = (char)higher_case;
      System.out.print(higher);
    }
    System.out.println();
  }
}
      
      
          
    
    