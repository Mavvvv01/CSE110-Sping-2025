import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();     
        boolean isStrong = true;
        if (password.length() < 8) {
            isStrong = false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            int code = (int)c;
            if (code >= 65 && code <= 90) {
                hasUpper = true;
            }
            else if (code >= 97 && code <= 122) {
                hasLower = true;
            }
            else if (code >= 48 && code <= 57) {
                hasDigit = true;
            }
            else if (!(code == 32)) {
                hasSpecial = true;
            }
        }
        if (!hasUpper || !hasLower || !hasDigit || !hasSpecial) {
            isStrong = false;
        }
        System.out.println(isStrong);
    }
}