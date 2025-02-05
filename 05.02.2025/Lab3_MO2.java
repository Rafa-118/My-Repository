class Main{

    int sum(int a,int b,int c){
        return a+b+c;

    }
    double sum(double a,double b,double c){
        return a+b+c;

    }
    String sum(String a,String b,String c){
        return a+b+c;

    }
    public static void main(String[] args){
        Main m1=new Main();

        int x=m1.sum(4,5,3);
        System.out.println(x);

        double y=m1.sum(4.3,2.5,5.5);
        System.out.println(y);

        String z=m1.sum("Object"," Oriented"," Programming");
        System.out.println(z);
    }
}
