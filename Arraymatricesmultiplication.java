import java.util.Scanner;
public class Arraymatricesmultiplication {
    //wap to input two matrices 3*3 order and find its multiplication


public static void main(String Args[]){
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j,k;
Scanner scan= new Scanner(System.in);
System.out.println("Enter Matrix of 3*3 ordser");

for(i=0;i<3;i++){
for(j=0;j<3;j++);{
a[i][j]=scan.nextInt();
}}
System.out.println("Enter Mayrix2 of 3*3 order");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
b[i][j]=scan.nextInt();
}}
//multiplication
System.out.println("Multiplication");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
for(k=0;k<3;k++){
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
System.out.print(c[i][j]+"\t");
}
System.out.println(); 
}}}

    

