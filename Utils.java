public class Utils {
    public static int sumOfDigits(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            int value = Character.getNumericValue(digit);
            sum += value;
        }
        return sum;
    }
}