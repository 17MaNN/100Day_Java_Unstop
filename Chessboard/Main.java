import java.util.Scanner;

public class Main {
    public static String determineColor(String s) {
        int col = s.charAt(0) - 'a' + 1;   
        int row = s.charAt(1) - '0';      

        if ((col + row) % 2 == 0) {
            return "Black";
        } else {
            return "White";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
