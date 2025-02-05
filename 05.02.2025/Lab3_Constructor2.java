class Book{
    String tittle;
    String author;
    int price;

    Book(){
        this.price=2500;
    }

    Book(String t,String a){
       this.tittle=t;
       this.author=a;
    }
    Book(String t,String a,int p){
        this.tittle=t;
        this.author=a;
        this.price=p;
    }
    public static void main(String[] args){
        Book b1=new Book("Nature"," Rio");
        Book b2=new Book("Nature"," Rio",2000);
        Book b3=new Book();

        System.out.println(b1.tittle+" "+b1.author);
        System.out.println(b2.tittle+" "+b2.author+" "+b2.price);
        System.out.println(b3.price);
    }
}
