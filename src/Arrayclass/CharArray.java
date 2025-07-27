package Arrayclass;
import java.util.Arrays;
import java.util.Scanner;
//enter a character & display & short them alphabetically using { Arrays.toString(arr)}
   public class CharArray {
    Scanner sc=new Scanner(System.in);
      char arr[]=new char[5];
   void setData()
        {
	           for(int i=0;i<arr.length;i++)
	   {
		            System.out.println("enter vowel");
		             arr[i]=sc.next().charAt(0);
		            
	   }
	         System.out.println("Arrays address show "+arr.toString());
	         //show only address in output
	         System.out.println("Arrays Before shorting "+Arrays.toString(arr));

	           Arrays.sort(arr);
		         System.out.println("Arrays after shorting "+Arrays.toString(arr));
	   }
		   
 void getData()
	           {
		         for(int i=0;i<arr.length;i++)
		    
			      System.out.println(arr[i]);
			         System.out.println("Array after shorting "+Arrays.toString(arr));
		  
	  }
   	public static void main(String[] args) {

		CharArray c=new CharArray();
		c.setData();
		c.getData();
	}

}
