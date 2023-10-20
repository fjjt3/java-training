import java.util.Scanner;

public class ArithOperator {
    public static void main(String[] args) {
        int a, b, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the value of a and b");
        // take two values from user
         a = scanner.nextInt();
         b = scanner.nextInt();

         result = a - b;
        System.out.println(" result = " + result);



    }
}
