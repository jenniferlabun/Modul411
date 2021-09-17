public class Lambdas {
    public static void main(String[] args) {
        Mathe addieren = (a, b) -> a + b;
        Mathe mult = (a, b) -> a * b;

        System.out.println(addieren.funktion(5, 2));
    }

    public interface Mathe {
        int funktion(int a, int b);
    }
}
