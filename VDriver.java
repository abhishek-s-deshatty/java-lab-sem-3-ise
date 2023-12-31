import java.util.Scanner;
abstract class Vehicle{
    int year_of_manufacture;
    Vehicle(){
        year_of_manufacture = 0;
    }
    Vehicle(int a){
        year_of_manufacture = a;
    }
    abstract int getData();
    abstract void putData(int a);
}

class TwoWheeler extends Vehicle{

    TwoWheeler(){
        super();
    }
    TwoWheeler(int a){
        super(a);
    }
    int getData(){
        return year_of_manufacture;
    }
    void putData(int a){
        year_of_manufacture = a;
    }
}

final class FourWheeler extends Vehicle{

    FourWheeler(){
        super();
    }
    FourWheeler(int a){
        super(a);
    }
    int getData(){
        return year_of_manufacture;
    }
    void putData(int a){
        year_of_manufacture =a;
    }
}

class MyTwoWheeler extends TwoWheeler{
    MyTwoWheeler(){
        super();
    }
    MyTwoWheeler(int a){
        super(a);
    }
    void putData(int a){
        super.putData(a);
    }
}

class VDriver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Object of MyTwoWheeler
        MyTwoWheeler  mtw = new MyTwoWheeler();
        System.out.println("-----------------------------------------");
        System.out.print("Enter the year of manufacture of your two wheeler:\t");
        int a = sc.nextInt();
        mtw.putData(a);
        System.out.println("The year of manufacture of my two wheeler is: "+mtw.year_of_manufacture);
        System.out.println("-----------------------------------------");
        //Object of FourWheeler;
        System.out.print("Enter the year of manufacture of the four wheeler:\t");
        int b = sc.nextInt();
        FourWheeler fw = new FourWheeler(b);
        System.out.println("The year of manufacture of the four wheeler is: "+fw.getData());
        System.out.println("-----------------------------------------");  
    }
}