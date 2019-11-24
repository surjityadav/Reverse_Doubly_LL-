
import java.util.Scanner;


public class Reverse_Doubly_LL 
{
    static Node head,tail;
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data=d;
            next=null;
            prev=null;
        }
    }
    public static Reverse_Doubly_LL insert(Reverse_Doubly_LL li,int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;
        newNode.prev=null;
        if(head == null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        return li;
    }
    public static void displayForward(Reverse_Doubly_LL li) 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp = head;
            while (temp != null) 
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void displayBackward(Reverse_Doubly_LL li) 
    {
        Node temp = tail;
        if (head == null) 
        {
            System.out.println("List is empty");
        }
        else
        {
             while (temp != null) 
            {
                System.out.print(temp.data+" ");
                temp = temp.prev;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Reverse_Doubly_LL  li=new Reverse_Doubly_LL ();
        System.out.println("How many elemnets you want to insert?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the " + (i + 1) + " element:");
            int a=sc.nextInt();
            li.insert(li, a);
        }
         System.out.println("Forward Display :");
         displayForward(li);
         System.out.println();
         System.out.println("Reverse Display :");
         displayBackward(li);
    }
}
