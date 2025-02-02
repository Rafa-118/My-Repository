import java.util.*;
class Student{
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args){
        Student s1=new Student();
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your name : ");
        s1.firstName=input.nextLine();
        System.out.println("My firstname is"+" "+s1.firstName);

        System.out.println("Enter your last name :");
        s1.lastName=input.nextLine();
        System.out.println("Dept name is :"+" "+s1.lastName);

        System.out.println("Enter your age ");
        s1.age=input.nextInt();
        System.out.println("My age is"+" "+s1.age);
    }
}
