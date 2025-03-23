import javax.print.attribute.standard.Copies;

public class CopyConstructor3 {

    String name;
    int id;

    CopyConstructor3(String name, int id){
        this.name=name;
        this.id=id;
    }

    CopyConstructor3(CopyConstructor3 c3){
        name=c3.name;
        id=c3.id;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }

    public static void main(String[] args) {
        CopyConstructor3 c1=new CopyConstructor3("Praga",101);
        CopyConstructor3 c2= new CopyConstructor3(c1);
        c1.display();
        c2.display(); //what is present in c1 object it will display here

        System.out.println("After Modifying"); //here the c2 object changes
        c2.name="Deesh";
        c2.id=102;
        c2.display();
    }
}
