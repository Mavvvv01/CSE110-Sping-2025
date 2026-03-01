import java.util.Scanner;
public class Task8{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the length of array 1: ");
    int arr1_length = sc.nextInt();
    int[] arr1 = new int[arr1_length];
    for(int i = 0;i<arr1_length;i++){
      int input = sc.nextInt();
      arr1[i] = input;
    }
    System.out.print("Please enter the length of array 2: ");
    int arr2_length = sc.nextInt();
    int[] arr2 = new int[arr2_length];
    for(int i = 0;i<arr2_length;i++){
      int input = sc.nextInt();
      arr2[i] = input;
    }  
    boolean isSubset = true;   
        for(int i = 0; i < arr2_length && isSubset; i++){
            boolean found = false;
            for(int j = 0; j < arr1_length && !found; j++){
                if(arr2[i] == arr1[j]){
                    found = true;
                }
            }
            if(!found){
                isSubset = false;
            }
        }
        if(isSubset){
            System.out.println("Array 2 is a subset of Array 1");
        }else{
            System.out.println("Array 2 is not a subset of Array 1");
        }
    }
}