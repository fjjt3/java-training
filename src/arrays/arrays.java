package arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int [] intArr = { 10, 20, 30, 40 ,50};
        float [] floatArr = new float[5];
        char charArr []  = new char[5];

        Scanner sc = new Scanner(System.in);

        floatArr[0] = 2.5F;
        floatArr[1] = 7.23F;
        floatArr[2] = 5.6F;
        floatArr[3] = 8F;
        floatArr[4] = 7.125F;

        System.out.println("items of int array: ");
        for (int i = 0; i<5; i++) {
            System.out.println("Enter charecter for index (" + i + "): ");
            charArr[i] = sc.next().charAt(0);
        }

        System.out.println();

        System.out.println("items of float array: ");
        for (float item: floatArr){
            System.out.println(item + " ");
        }
        System.out.println();

        System.out.println("items of character array: ");
        for (char ch: charArr){
            System.out.println(ch + " ");
        }
        sc.close();

    }
}
