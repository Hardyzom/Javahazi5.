import java.util.Scanner;

public class PyUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String input() {
        return scanner.nextLine();
    }
}