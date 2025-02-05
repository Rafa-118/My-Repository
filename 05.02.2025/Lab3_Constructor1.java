public class Main{
    int modeYear;
    String modeName;

    Main(int year,String name){
        modeYear=year;
        modeName=name;
    }
    public static void main(String[] args){
       Main m1=new Main(2002," Rio");
        System.out.println(m1.modeYear+" "+m1.modeName);
    }
}
