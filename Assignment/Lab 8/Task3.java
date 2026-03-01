//Task3
public class Task3{
  public static void main(String[]args){
    boolean res = isTriangle(7, 5, 10);
    System.out.println(res);
    triArea(7, 5, 10);
  }
  public static boolean isTriangle(int n1, int n2, int n3){
    if(n1+n2>n3 && n2+n3>n1 && n3+n1>n2){
      return true;
    }else{
      return false;
    }
  }
  public static void triArea(int m1, int m2, int m3){
    if(isTriangle(m1, m2, m3)==true){
      double semiP = (m1+m2+m3)/2;
      double value = semiP*(semiP-m1)*(semiP-m2)*(semiP-m3);
      double area = Math.sqrt(value);
      System.out.println(area);
    }else{
      System.out.println("Can't form triangle");
    }
  }
}
      
