package Arrayclass;
import java.util.Scanner;
public class For_each_loop2_Array {
//check the value are present in array or not
	Scanner sc=new Scanner(System.in);
       int[]values= {10,44,55,33,22,88};
       
	void  disp()
	{
		//for-each loop
     	 for(int element:values)        //value are store in "element" variable & ele. print
		{
			
			System.out.println(element);
		}
		System.out.println("Array length"+values.length);
		
	}
	void check()
	{
		System.out.println("enter a value to search");
		int num=sc.nextInt();
         
		boolean isArray=false;
    	 
         for(int element:values)           //valuse are store in "elemenrt" variable
         
		if(num==element)
			{
			   isArray=true;                 //true store in isArray
			  break;
		}
             if(isArray==true)   
		
		{	
			System.out.println("value is present");
			
	}

	
		else
		{
			System.out.println("value is not present");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		For_each_loop2_Array A=new For_each_loop2_Array();
		A.disp();
		A.check();
	}

}
