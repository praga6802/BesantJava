// Association - Has a relationship
//Composition because the class books cannot run independently

class Address{
    String streetno;
    String streetname;
    String city;

    Address(String streetno, String streetname, String city){
        this.streetno=streetno;
        this.streetname=streetname;
        this.city=city;
    }
    void addressDetails(){
        System.out.println("Street No: "+streetno);
        System.out.println("Street Name: "+streetname);
        System.out.println("City: "+city);
    }
}

public class Student {
    String studentname;
    Address addressobj;

    public Student(String studentname, Address addressobj){
        this.studentname=studentname;
        this.addressobj=addressobj;
    }

    public void studentDetails(){
        System.out.println("Student Name: "+studentname);
        System.out.println("Student Address: "+addressobj.streetno+" "+addressobj.streetname+" "+addressobj.city);
    }

    public static void main(String[] args) {
        Student s= new Student("Pragadeeswaran",new Address("66/67","Sourasthra Middle Street","Kumbakonam"));
        s.studentDetails();
    }
}
