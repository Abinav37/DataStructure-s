import java.util.Scanner;

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if (check(str)) 
            System.out.println("true");
        else 
            System.out.println("false");
        
    }

    public static boolean check(String ip) {
        String[] arr = ip.split("\\.");

        if (arr.length != 4) {
            return false;
        }

        for (String val : arr) {
            if (!check2(val)) {
                return false;
            }
        }

        return true;
    }

    private static boolean check2(String val) {
        if (val.length() == 0 || val.length() > 3) {
            return false;
        }

        if (val.charAt(0) == '0' && val.length() > 1) {
            return false; 
        }

        for (char c : val.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        int num = Integer.parseInt(val);
        return num >= 0 && num <= 255;
    }
}
