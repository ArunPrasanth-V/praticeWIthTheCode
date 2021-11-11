package praticeWIthTheCode;
import java.util.*;
public class Code   //it is a tlc Code...
{
    public static void main (String args[])
    {
    while(true)
    {
    getNumber();	
    }
    }
  public static void getNumber()
  {
	 
	  Scanner sc=new Scanner(System.in);
	  int a,b;
	  a=sc.nextInt();
	  b=sc.nextInt();
	  int c=a+b;
	  if(a==10||b==10||c==10)
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("flase");
	  }
  }
      
}


