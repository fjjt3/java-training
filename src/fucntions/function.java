package fucntions;

public class function {
    public static int add(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }

    public static int factorial(int num){
        if (num <=1 )
            return num;
        return num*factorial(num-1);

    }

    public static void main(String[] args) {
        int num = 5, res;

        res = (int) Math.pow(num, 3);
        System.out.println(num + "^3: " + res);
    }
}
