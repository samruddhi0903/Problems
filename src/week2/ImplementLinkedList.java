//Program to Implement LinkedList

package week2;

public class ImplementLinkedList {
    public static void main(String[] args) {
        Number_list l = new Number_list();
        l.accept(4);
        l.accept(5);
        l.accept(7);
        l.accept(8);
        l.accept(9);
        System.out.println("List : ");
        l.display();
        l.totalSize();
        l.removeNumber(5);
        System.out.println("List : ");
        l.display();
        l.totalSize();
    }
}

class Node
{
    int n;
    Node next;
    Node(int n)
    {
    	this.n = n;
    	next = null;
    }
};

class Number_list
{
	Node head;
	Node temp;
	Number_list()
	{
	    this.head = null;
	    this.temp = null;
	}
	void accept(int n)                                //accepting data
	{
	    Node newnode;
		newnode= new Node(n);
	    if(head == null)
	    {
	    	head=newnode;
	    	temp=newnode;
	    	newnode=null;
	    }
	    else
	    {
	    	temp.next=newnode;
	    	temp=newnode;
	    }
	}

	void display()                    //display list
	{
		Node ptr;
		ptr = head;
		while(ptr!= null)
		{
			System.out.print(ptr.n + " ");
		    ptr = ptr.next;
		}
        System.out.println();
	}

	void totalSize()                  //calculating total size of list
	{
		int i=0;
		Node ptr;
		ptr=head;
		while(ptr!=null)
		{
            ptr=ptr.next;
            i++;
		}
		System.out.println("Total size : "+ i );
	}

	void removeNumber(int n)            //removing number
	{
		Node ptr, prev=null;
		ptr=head;
		if(head.n == n)
		{
		    head=ptr.next;
		}
		ptr=head;
		while(ptr!= null)
		{
			if(ptr.n == n)
			{
			    prev.next=ptr.next;
		        ptr.next=null;
		        break;
	        }
	        prev=ptr;
	        ptr=ptr.next;
		}
	}
}