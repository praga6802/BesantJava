class CopyConstructor {

    CopyConstructor(){
        System.out.println("Parent class constructor");
    }
}

public class CopyConstructor2{

    CopyConstructor cc; //creating parent class reference variable and passing into child class constructor

    CopyConstructor2(CopyConstructor cc){
        //invisible parent class constructor
        this.cc=cc;
        System.out.println(cc);
    }

    public static void main(String[] args) {
        CopyConstructor cc= new CopyConstructor();
        CopyConstructor2 cc2= new CopyConstructor2(cc);
    }
}
