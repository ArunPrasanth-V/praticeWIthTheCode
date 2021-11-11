package praticeWIthTheCode;
import java.util.*;
public class Code2 
{
   public static void main(String args[])
   {
	  
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter THE Number");
	   int i=sc.nextInt();
	   int j=sc.nextInt(); //it is also one method to call user inputs
	   int k=sc.nextInt();
	  // method1(c,v);
	   method1(i,j,k);
	   
   }
  
   public static void method1(int i, int j)
   {
	   System.out.println(i*j);
   }
   public static void method1(int i, int j, int k)
   {
	   System.out.println(i*j*k);
   }
}
