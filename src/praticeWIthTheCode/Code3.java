package praticeWIthTheCode;

import java.util.Scanner;

public class Code3 
{
	   public static void main(String args[])  //this program is in my 1St year Python pratical but i didn't answer it look tough at that time :) 
	     {
	    	 while(true)
	    	 {
	    		 Code3  vu=new Code3 ();
	    	 }
	     }
	     Scanner sc=new Scanner(System.in);
	     int i,j,num;
	     Code3  ()
	     {
	         System.out.println("\nEnter the Number:");
	         num=sc.nextInt();
	         int str=1;
	    	 for(i=str;i<=num;i++)// i== 1..2..3..4..
	    	 {
	    		 for(j=i;j<=num;j++)
	    		{
	    		     System.out.print(j+"*");
	        	}
	    	 
	         System.out.println();
	    	 }
	     }
}
/* 
 * DryRun
 *for(j=i;j<=num;j++)
 *
 *               
 *   Steps         1       2       3        4
 *   
 * Line 20)  i=1            i=2     i=3     i=4
 * 
 * Line 22)  j=1   1<=4     2<=4    3<=4    4<=4   next it will execute and go to i 7& i become 3 &i become 2 & i become 1
 *                                                                                    |           |           | 
 * Line 24)         1*      1*2*    1*2*3*  1*2*3*4*               output   |1*2*3*4* |2*3*4*     |3*4*       |4*
 * 
 * in above DryRun It will Execute only j
 * 
 *  Line 20)i<=num       i<=num         i<=num   i<=num   i<=num   
 *                       1<=4 True      2<=4     3<=4      4<=4     
 *                       1*2*3*4*       2*3*4*   3*4*      4*
 *                  
 *                                       
 *             
 */
