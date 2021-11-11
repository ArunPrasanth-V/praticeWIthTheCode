package praticeWIthTheCode;
import java.util.*;
public class Pratice {
//delete an element in an array
	public static void main(String[] args)
	{
		      
	 int array[]= new int[5];//this is not a index
	 array[0]=21;
	 array[1]=33;
	 array[2]=65;//override
	 array[3]=55;
	// array[5]=0;
	 int location=3;
	 int num=45;
	 int index=4;//0 TO 4 so, 5
	 System.out.println("After");
     for(int i=index;i>location;i++)
     {//       4        4-1=3 3-value store in-4
    	 array[i]=array[i-1];//read value in array[i-1]
     }
     //then get out loop
     //location ku munadila atha value apadiye irrku 
     //ippo atha loction la matt2 value irrkathu
	 //array[location]=num;//ippo antha value um alocate aakuthu
	 for(int i=0;i<=index;i++)
     	 {
		   System.out.println(array[i]);
	     }
	 }
}
/*
*DRYRUN
*Line 15: 
*
*/