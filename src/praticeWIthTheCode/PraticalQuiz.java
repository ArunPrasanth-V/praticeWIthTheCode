package praticeWIthTheCode;
import java.util.*;
public class PraticalQuiz//my output is when i call 4 output will like this 1*2*3*4=Ans
{
     public static void main(String args[])  //this program is in my 1St year Python pratical but i didn't answer it look tough at that time :) 
     {
    	 while(true)
    	 {
    	 PraticalQuiz vu=new PraticalQuiz();
    	 }
     }
     Scanner sc=new Scanner(System.in);
     int i,j,num;
     PraticalQuiz ()
     {
         System.out.println("\nEnter the Number:");
         num=sc.nextInt();
    	 for(i=0;i<1;i++) //Here i<1 represent number of Line You want To Print..
    	 {
    		 for(j=1;j<=num;j++)
    		 {
    		 System.out.print(j+"*");
        	 }
       //  System.out.print("="+j*num);
    	 }
     }
}
/*  4
*Line18)      i=1           i=2    i=3    i=4       i=5       
*Line20)  j-  1<=4 true     2<=4   3<=4   4<=4      5<=4 (false)
* Line22)     1*            1*2    1*2*3  1*2*3*4               
*Line 24)     
*/