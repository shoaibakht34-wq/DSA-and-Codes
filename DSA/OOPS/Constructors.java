package DSA.OOPS;

import DSA.OOPS.ObjectstoMethods.Car;

public class Constructors {
    public static class Car{
        int seats;
            String name;
        double length;
        String type;
        Car(){//Default constructer

        }
        Car (int x,String s,double d){
           seats=x;
           name=s;
           length=d; 
        }
        //int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1=new Car(5,"Kia sonet",3.99);
        c1.print();
        
}

}
