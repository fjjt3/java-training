package accessSpecifiers;

class C {
    public int p; // public member can be accesible by any class
    int q; // default vlbe can be accesible from same packege
    private int r; // non accesible fron any other class

    public C(int a, int b, int c){
        p=a;
        q= b;
        r=c;
    }
    public void display(){
        System.out.println("The value of p: " + p);
        System.out.println("The value of q: " + q);
        System.out.println("The value of r: " + r);
    }
}
