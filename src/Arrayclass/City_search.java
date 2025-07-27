package Arrayclass;
import java.util.Arrays;
import java.util.Scanner;
//enter a city name & search it present or not  in array
public class City_search {
	Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		String arr[]=new String[n];
		
 void input()
       	{
	       for(int i=0;i<arr.length;i++) {
		     System.out.println("enter a city name");
		     arr[i]=sc.next();
	  }
	   }
 void disp()
	   {
		   for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}		  
	}
 void search(){
     int flag = 0;
     String str;
     System.out.println("Enter a city name to search: ");
     str = sc.next();

     for (int i = 0; i < arr.length; i++) {
         if (arr[i].equalsIgnoreCase(str))
         {
             System.out.println("City is found");
            // flag = 1;
             break;
         }
 }

     if (flag == 0) {
         System.out.println("City is not found");
     }
 }
 
	public static void main(String[] args) {
		System.out.println("enter no.of city");

		City_search s=new City_search();
				s.input();
				s.disp();
				s.search();
	}
}
