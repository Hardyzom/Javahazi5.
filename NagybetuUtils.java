import java.util.Scanner;

public class NagybetuUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String swapCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}