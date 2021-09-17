import java.util.Random;

public class A {

    public void verschleiern(String input) {
        System.out.println(new StringBuilder(input).reverse().toString());
    }
    public void random() {
        Random random = new Random();
        Random rSeed = new Random(123456);
        // ganze Zahl Zufall
        System.out.println(random.nextInt());
        // bei mehrmals Run bleibt die Zahl gleich
        System.out.println(rSeed.nextInt());
        // bound ist die Grenze, sie muss unter 3 sein
        System.out.println(random.nextInt(3));
        System.out.println(random.nextInt(3));
        System.out.println(random.nextInt(3));
        System.out.println(random.nextInt(3));
        // boolean Zufall
        System.out.println(random.nextBoolean());
        // double Zufall
        System.out.println(random.nextDouble());
        // long Zufall
        System.out.println(random.nextLong());
    }

    public void randomMitOberUndUntergrenze(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max muss grösser sein als min");
        }

        Random r = new Random();
        System.out.println(r.nextInt((max - min) + 1) + min);
    }
    public void loveOrNot() {
        Random r = new Random();
        int result = r.nextInt(2);
        if (result == 0) {
            System.out.println("No love");
        }
        else {
            System.out.println("Love");
        }
    }
};