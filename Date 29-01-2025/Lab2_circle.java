import java.util.*;
class Circle{
    double r;
    double area;
double circumference;
    void area(){
        System.out.println(3.1416*r*r);

    }
void circumference(){
    System.out.println(2*3.1416*r);

}
void display(){
    System.out.println(r);
}
public static void main(String[] args){
        Circle circle=new Circle();
        Scanner input=new Scanner(System.in);
        System.out.println("enter radius : ");
        circle.r=input.nextDouble();
circle.area();
        circle.circumference();
        circle.display();
    }
}
