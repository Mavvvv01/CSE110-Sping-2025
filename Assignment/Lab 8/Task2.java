public class Task2{
  public static void main(String[]args){
    double area = circleArea(5);
    System.out.println(area);
    double volume = sphereVolume(5.0);
    System.out.println(volume);
    findSpace(5, "sphere");
  }
  public static double circleArea(double n){
    return(Math.PI*n*n);
  }
  public static double sphereVolume(double n){
    return ((4.0/3.0)*Math.PI*n*n*n);
  }
  public static void findSpace(int n, String s){
    double n2 = n/2.0;
    if(s.equals("circle")){
      double circleA = circleArea(n2);  
      System.out.println(circleA);
    }else if(s.equals("sphere")){
      double sphereV = sphereVolume(n2);
      System.out.println(sphereV);
    }else{
      System.out.println("Wrong Parameter");
    }
  }
}
  