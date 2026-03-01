//Task 6
import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    for(int row_count = 1;row_count<=row;row_count++){
      for(int space_count = 1; space_count<=row-row_count; space_count++){
        System.out.print(" ");
      }
      for(int num = 1; num<=2*row_count-1; num++){
        System.out.print(num);
      }
      System.out.println();
    }
    for(int row_count = row - 1; row_count >= 1; row_count--){     
      for(int space_count = 1; space_count <= row - row_count; space_count++){
        System.out.print(" ");
      }
      for(int num = 1; num <= 2 * row_count - 1; num++){
        System.out.print(num);
      }
      System.out.println();
    }
  }
}