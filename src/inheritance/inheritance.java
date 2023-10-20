package inheritance;

class Employee{
    protected double salary = 30000D;
    public Employee(){
        System.out.println("This is constructor of Employee class");
    }
}

class Developer extends Employee{
    double bonus = 10000;
    public Developer(){
        System.out.println("This is constructor of Developer class");
    }

    public void displaySalary(){
        // the vble salary is in the base class
        System.out.println("The dev salary is: " + (salary + bonus) + "\n" );
    }

}

public class inheritance {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        dev1.displaySalary();

    }
}
