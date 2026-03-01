//Task 9
import java.util.Scanner;
  public class Task9{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first side of the triangle: ");
    int side1 = sc.nextInt();
    System.out.println("Enter second side of the triangle: ");
    int side2 = sc.nextInt();
    System.out.println("Enter second side of the triangle: ");
    int side3 = sc.nextInt();
    
    if(side1 == side2 || side2==side3 || side3==side1){
      System.out.println("This is an Isosceles triangle");
    }
    else if(side1==side2 && side2==side3){
      System.out.println("This is an Equilateral triangle");
    }
    else{
      System.out.println("This is a Scalene triangle");
    }
  }
}
    