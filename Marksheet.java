//wap to create a class student ,input student,Name and marks of three subjects and generate the marksheet with total,percentage,and
import java.util.*;
class Student{
String sname;
int m1,m2,m3,total;
float per;
void input(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter Student name, marks of three subjects. :");
sname=scan.next();
m1=scan.nextInt();
m2=scan.nextInt();
m3=scan.nextInt();
}void result(){
System.out.println("________________________");
total=m1+m2+m3;
per=total/3.0f;
System.out.println("Student name\t"+sname);
System.out.println("Total marks\t"+total);
System.out.println("Percentage\t"+per);
if(per>=60)
System.out.println("First divison.");
else if(per>=45)
System.out.println("Second divison.");
else if(per>=30)
System.out.println("Third divison.");
else
System.out.println("Fail.");
}
}
public class Marksheet {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student();
        Student stu3=new Student();
        stu1.input();
        stu2.input();
        stu3.input();
        stu1.result();
        stu2.result();
        stu3.result();

    }
    
}
