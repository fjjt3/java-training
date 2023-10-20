package abstraction;

public class Myclass2 extends Myclass1{

    @Override
    void myfuction12() {
        System.out.println("myfuction12 is executing...");
    }

    public static void main(String[] args) {
        Myclass2 ob1 = new Myclass2();
        ob1.myfuction11();
        ob1.myfuction12();
    }
}
