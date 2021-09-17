public class ARun {
    public static void main(String[] args) {
        A a = new A();
        a.verschleiern("Abend");
        a.random();
        a.randomMitOberUndUntergrenze(1, 3);
        a.loveOrNot();
    }
}