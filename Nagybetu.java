public class Nagybetu {
    public static void main(String[] args) {
        String text = NagybetuUtils.input("Kérem, adjon meg egy szöveget: ");
        String swappedText = NagybetuUtils.swapCase(text);
        System.out.println("Felcserélt szöveg: " + swappedText);
    }
}