//Task 7
import java.util.Scanner;
public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int column = sc.nextInt();
    int row_count = 1;
    while(row_count<=row){
      int column_count = 1;
      while(column_count<=column){
        if(column_count==1||column_count==column||row_count==1||row_count==row){
          System.out.print(column_count);
        }
        else{
          System.out.print(" ");
        }
        column_count++;
      }
      System.out.println();
      row_count++;
    }
  }
}
       
                                              
    