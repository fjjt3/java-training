package exceptionDemo;

public class exceptionHandle {
    public static void main(String[] args) {
        try{
            int result = 22/0;
            System.out.println(" result= " + result);
        } catch(ArithmeticException arithEx){
            System.out.println("Dividing by 0 in not allowed.");
            System.out.println("The exception is: " + arithEx);
        } finally{
            System.out.println("Operation performed");
        }
        System.out.println("End of the program ...");
    }
}
