import java.util.Scanner;
class ReverseLinked{
	static int test_case = 1;
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}
	void insert(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.prev = null;
		if(head!=null)
		{
			head.prev = new_node;
		}
		head = new_node;
		
	}
	
	void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
	public static void main(String[]args)
	{
		ReverseLinked r = new ReverseLinked();
		Scanner sc = new Scanner(System.in);
		// Enter test case numberr
		test_case = sc.nextInt();
		// Enter the number of elements
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			r.insert(sc.nextInt());
		}
		System.out.println("Output : ");
		r.display();
	}
}