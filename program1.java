import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        long triangle = 0;
        long f = 1;
        

        for ( int i = 1; i <= n; i++) {
            triangle = (n * (n + 1)) / 2;
            f = f * i;
        }

        System.out.println(" n-ое треугольного число (сумма чисел от 1 до n): " + triangle);
        System.out.println("n! (произведение чисел от 1 до n): " + f);
    }
}