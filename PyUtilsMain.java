public class PyUtilsMain {
    public static void main(String[] args) {
        String name = PyUtils.input("Neved: ");
        System.out.printf("Hello %s!\n", name);
        
        String input = PyUtils.input();
        System.out.printf("Bemenet: %s\n", input);
    }
}