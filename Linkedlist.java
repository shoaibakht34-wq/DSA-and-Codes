//program to implementation of singly linked list
import java.util.Scanner;
public class Linkedlist {
    static Scanner scan;
    Linkedlist(){
        scan=new Scanner(System.in);
    }
    class NODE{
        int data;
        NODE next;
    }
    NODE start=null;
    void insert(){
        NODE node=new NODE();
        System.out.println("Enter the value to be insert");
        node.data=scan.nextInt();
        node.next=null;
        if(start==null){
            start=node;
        }
        else{
            NODE temp;
            temp=start;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    void delete(){
        if(start==null){
            System.out.println("Underflow");
        }
        else if(start.next==null){
            System.out.println(start.data+"is deleted");
            start=null;
        }
        else{
            NODE temp,prtemp;
            temp=prtemp=start;
            while(temp.next!=null){
                prtemp=temp;
                temp=temp.next;
            }
            System.out.println(temp.data+"is deleted");
            prtemp.next=null;
        }
    }
    void search(){
        NODE temp;
        int n,s=0;
        if (start==null){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Enter the element to be search");
            n=scan.nextInt();
            temp=start;
            while(temp!=null){
                if(temp.data==n){
                    System.out.println("Element is found");
                    s++;
                    break;
                }
                temp=temp.next;
            }
            if(s==0){
                System.out.println("Elemnet is not found");
            }
        }
    }
    void display(){
        NODE temp;
        if(start==null){
            System.out.println("UNderflow");
        }
        else{
            temp=start;
            System.out.println("_______________Elements are_________________");
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        int ch;
        Linkedlist list=new Linkedlist();
        while(true){
            System.out.println("1.Insert\n2. Delete\3. Search\n4. Display\5. Exit");
            System.out.println("Enter your Choice");
            ch=scan.nextInt();
            switch(ch){
                case 1:
                    list.insert();
                    break;
                    case 2:
                        list.delete();
                        break;
                        case 3:
                            list.search();
                            break;
                            case 4:
                            list.display();
                            break;
                            case 5:
                                System.exit(0);
                                break;
                                default:
                                    System.out.println("Wrong choice");
                             
            }
        }
    }
}
