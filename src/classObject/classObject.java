package classObject;

class Student {

    String name;
    int id;
    String major;

    void setName(String stName){
        name = stName;
    }

    void setMajor(String subject){
        major = subject;
    }

    void display(){
        System.out.println(" The student name: " + name);
        System.out.println("Student id" + id);
        System.out.println("Major Subject" + major);
        System.out.println();
    }

}

public class classObject{
    public static void main(String[] args) {
        Student s1, s2;
        s1 = new Student();
        s2 = new Student();

        s1.setName("Joy");
        s1.id = 1021;
        s1.setMajor("Computer Science");

        s2.setName("Pepe");
        s2.id = 1022;
        s2.setMajor("Computer Science");

        s1.display();
        s2.display();

    }
}
