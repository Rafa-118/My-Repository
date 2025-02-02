
public class Main{
    public static void prime (int z){
        if(z<2){
            System.out.println(z+ "is not prime");
        }
        for(int i=2; i*i<z; i++)
        {
            if(z%i == 0 ){
                System.out.println(z+ " "+"is not prime");
                break;

            }
            else{
                System.out.println(z+" " + "is prime");
                break;
            }

        }
    }

    public static void main(String[] args){
        int[] a={5,7,8,11,17,40};
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];

        }
        System.out.println("Sum : "+sum);
        System.out.println("Average :" + sum/6);
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0)

                System.out.println("Even Num: "+a[i]);
            else
            {
                System.out.println("Odd Num: "+a[i]);

            }
        }
        int x=0;
        for(int i=1; i<=100; i++ ){
            x=x+i;}
        {System.out.println("Sum: "+x);

        }
        int y=25;
        for(int i=1; i<=10; i++) {
            System.out.println(y * i);
        }
        int r=7;
        int s=11;
        int m=2;
        if(r>s && r>m)
        {
            System.out.println("r is the largest");

        }
        else if(s>m && s>r)
        {
            System.out.println(s + " "+"is the largest");

        }
        else{
            System.out.println("m is the largest");

        }
        prime(23);

    }
}



