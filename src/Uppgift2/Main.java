package Uppgift2;

public class Main {
    public static void main(String[] args){

        Student student1 = new Student("Marta", "Zygmunt", "Nackademin", 41);

        System.out.println("First name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("School name: " + student1.getSchoolName());
        System.out.println("Age: " + student1.getAge() + " years old");

    }
}