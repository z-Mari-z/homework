public class Main {
    public static void main (String[] args) {
        double a = 125.45;
        double b = 67;
        double c = a;
        double d = b;
        a = d;
        b = c;
        System.out.println(a + "\n" + b);
    }
}
