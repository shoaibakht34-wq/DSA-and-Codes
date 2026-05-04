package DSA.OOPS;

import java.util.Scanner;

public class UserDefinedData {
    public static class Student{//own data type created by user
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();//declatrion of object
        s1.name="Raja";
        s1.rno=76;
        s1.cgpa=6.4;
        Student s2=new Student();//declatrion of object
        s2.name="Ravi";
        s2.rno=54;
        s2.cgpa=5.4;
        Student s3=new Student();//declatrion of object
        s3.name="Rajan";
        s3.rno=sc.nextInt();
        s3.cgpa=8.3;
        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        s2.cgpa=9.8;
        System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);
        System.out.println(s3.name+" "+s3.rno+" "+s3.cgpa);
    }
}
