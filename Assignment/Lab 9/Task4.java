public class Task4{
  public static void main(String[]args){
    System.out.println(reverse_string("Hello", 0));
  }
  public static String reverse_string(String str, int index){
    if(index==str.length()-1){
      return ""+str.charAt(index);
    }
    else{
      return reverse_string(str, index+1) + str.charAt(index);
    }
  }
}
    
    
    