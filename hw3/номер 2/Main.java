import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        }else{
            max = b;
        }
        if (max > c){
            System.out.println(max + " больше");
        }else{
            max = c;
            System.out.println(max + " больше");
        }
    }
}
