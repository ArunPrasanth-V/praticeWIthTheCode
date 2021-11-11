package praticeWIthTheCode;
import java.util.*;
public class Code4
{
	int[]stack=new int[5];
	int top=0,data=0;
	 
	public static void main(String[] args) 
	{
		
		{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Element You want to Push");
	
		//int a=sc.nextInt();
		Code4 num=new Code4();
		
		num.push(5);
		num.push(4);
		num.push(9); // stack follows last in first out...
		num.push(8);
		num.push(3);
		num.pop();
	    num.show();
		}
	}
	
	
	
	
	
    public boolean isEmpty()
    {
    	return top<=0;
    }
	
	public  void push(int data)   //here we cannot call the stack..because we cannot define instant variable(inside stack)
	{
		
		if(top==5)
		{
			System.out.println("we cannot insert the last element You entered..Because The Stack is Full :(");
		}
		else
		{
		stack[top]=data;
		top++;
		}
	}
	public int pop() //here we cannot use the void because it return nothing(void)....return type
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty  :(");
		}
		else
		{
		top--;
		data =stack[top];
		stack[top]=0;
		}
		return data;
		}
	public int peek()
	{
		
		data=stack[top-1];
		stack[top] =0;
		return data;
	}
	public void show()
	{
		for(int n:stack)  //enhanced for loop
		{
			System.out.println(n+" ");
		}
	}
	
}
