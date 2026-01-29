import java.util.Scanner;
public class Queue {
    int front,rear,MAX=10;
    int que[]=new int[MAX-1];
    static Scanner scan;
    Queue(){
        scan= new Scanner(System.in);
        front=rear=-1;
    }
    void insert(){
        if(rear==MAX-1){
            System.out.println("Overflow");
        }
        else if(front==-1&& rear==-1){
            front=rear=0;
            System.out.println("Enter the first element");
            que[rear]=scan.nextInt();
        }
        else{
            System.out.println("Enter the element to be insert");
            que[++rear]=scan.nextInt();
        }
    }
    void delete(){
        if(front==-1 && rear==-1){
            System.out.println("Underflow");
        }
        else if(front==rear){
            System.out.println(que[rear]+"is Deleted");
            front=rear=-1;
        }
        else{
            System.out.println(que[front]+"is Deleted");
            front++;
        }
    }
    void search(){
        int n,s=0,i;
        if(front==-1&& rear==-1){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Enter the Element to be Search");
            n=scan.nextInt();
            for(i=front;i<=rear;i++){
              if(n==que[i]){
                System.out.println("Element is found");
                s++;
                break;
              }
            }
            if(s==0){
                System.out.println("Element is not Found.");
            }
        }
    }
    void display(){
        int i;
        if(front==-1&&rear==-1){
            System.out.println("underflow");
        }
        else{
            System.out.println("___________________list of elements_________________");
            for(i=front;i<=rear;i++){
                System.out.println(que[i]);
            }
        }
    }
    public static void main(String[] args) {
        int ch;
        Queue quee=new Queue();
        while(true){
            System.out.println("1.Insert \n2. Delete\n3. Search\n4. Display\n5. Exit");
            System.out.println("Enter the choice");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                quee.insert();
                break;
                case 2:
                quee.delete();
                break;
                case 3:
                quee.search();
                break;
                case 4:
                quee.display();
                break;
                case 5:
                System.exit(0);
                default:
                System.out.println("Wrong Choice,Try Again");
            }
        }
    }
}
