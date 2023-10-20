package exceptionDemo;

public class builtinException {
    public static void main(String[] args) {
        int [] myArray = {10, 10, 30 , 40, 50};
        String myString  = null;

        try { //this try block is to handle ArrayIndexOutOfBoundsException
            System.out.println("The value of myArray[10]: " + myArray[10]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index of Array.");
        }

        try { //this try block is to handle NullPointerException
            System.out.println("Character at 5 of the string: " + myString.charAt(5));
        }catch (NullPointerException e) {
            System.out.println("The string is pointing a null value.");
        }

        try {
            int number = Integer.parseInt("ABC"); // the sritng is not a valid number
            System.out.println("The number is: " + number);
        }catch (NumberFormatException e) {
            System.out.println("It is not a valid number.");
        }
    }
}
