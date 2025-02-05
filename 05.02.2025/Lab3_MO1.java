import java.util.*;
class Main{
    int a,b;
    double c,d;
    String r,m;

    int sum(int a,int b){
        return a+b;

    }
    double sum(double c,double d){
        return c+d;

    }
    String sum(String r,String m){
        return r+m;

    }
    public static void main(String[] args){
        Main m1=new Main();
        Scanner input=new Scanner(System.in);

        System.out.println("Enter int a:");
        m1.a=input.nextInt();
        System.out.println("Enter int b:");
        m1.b=input.nextInt();

        System.out.println("Enter double c:");
        m1.c=input.nextDouble();
        System.out.println("Enter double d:");
        m1.d=input.nextDouble();

        input.nextLine();
        System.out.println("Enter String r:");
        m1.r=input.nextLine();
        System.out.println("Enter String m:");
        m1.m=input.nextLine();



        int x=m1.sum(m1.a,m1.b);
        System.out.println(x);

        double y=m1.sum(m1.c,m1.d);
        System.out.println(y);

        String z=m1.sum(m1.r, m1.m);
        System.out.println(z);
    }
}
