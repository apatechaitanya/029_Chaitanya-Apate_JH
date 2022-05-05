// Q3:Java program to implement two stacks in a single array.
// Note: Please check is required to be update in list and then define test case.
// Input values :
// push1(5);
// push2(10);
// push2(15);
// push1(11);
// push2(7);
// push2(40);
// Output: (Required to be printed like this only)
// Popped element from stack1 is 11
// Popped

class twostacks
{
	int array[];
	int top1;
	int top2;
	int size;
	twostacks(int d)
	{
		size = d;
		array = new int[d];
		top1 = -1;
		top2 = size;
		
	}
	void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			array[top1] = x;
		}
	}
	void push2(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			array[top2] = x;
		}
		
	}
	int pop1()
	{
		if(top1>=0)
		{
			int x = array[top1];
			top1--;
			return x;
		}
		else{
			System.out.print("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	int pop2()
	{
		if(top2<size)
		{
			int p = array[top2];
			top2++;
			return p;
		}
		else{
			System.out.println("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}
	public static void main(String[] args)
	{
		twostacks s = new twostacks(5);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		System.out.println("Popped element from stack1 is "+s.pop1());
		s.push2(40);	
		System.out.println("Popped element from stack2 is "+s.pop2());
	}
}