// Association - Has a relationship
//Aggregation because the class books can run independently

class Library{

    Books bobj;
    void collectionOfBooks(Books bobj){
        this.bobj=bobj;
        System.out.println("Library");
        System.out.println("Book Name: "+bobj.bookname1);
        System.out.println("Book Name: "+bobj.bookname2);
        System.out.println("Book Name: "+bobj.bookname3);
        System.out.println("Book Name: "+bobj.bookname4);
    }
}

public class Books {
    String bookname1="Harry Potter";
    String bookname2="Jungle Book";
    String bookname3;
    String bookname4;

    public Books(String bookname3, String bookname4){
        this.bookname3=bookname3;
        this.bookname4=bookname4;
    }
    void displayBooks(){
        System.out.println(bookname1);
        System.out.println(bookname2);
        System.out.println(bookname3);
        System.out.println(bookname4);
    }

    public static void main(String[] args){
        Books b= new Books("Jurassic Park", "Avengers");
        b.displayBooks();

        Library l= new Library();
        l.collectionOfBooks(b);
    }
}
