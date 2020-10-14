import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a <= b){
            a = a - 1;
            b = b + 1;
        }
        System.out.println(a - b);
    }
}
