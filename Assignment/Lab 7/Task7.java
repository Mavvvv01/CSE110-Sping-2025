import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 100, 23, 56, 100};
        System.out.print("Input array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        int[] newArr = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                newArr[index++] = arr[i];
            }
        }
        System.out.print("New array: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}