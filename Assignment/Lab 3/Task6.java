import java.util.Scanner;
public class Task6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int y = 0;
    int sign = 1;
    
    for(int i =1;i<=n; i++){
      y+=sign*i*i;
      sign*= -1;
    }
    System.out.println("The expression of y: " + y);
  }
}
    
 