public class Task7{
  public static void main(String[]args){
    int[] arr = {5,6,2,1,8,7};
    int index = 2;
    print_element(arr, index);
  }
  public static void print_element(int[] arr1, int ind){
    if(ind==arr1.length){
      return;
    }
    else{
      System.out.println(arr1[ind]);
      print_element(arr1, ind+1);
    }
  }
}