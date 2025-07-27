package Arrayclass;
import java.util.Arrays;

//take a input 5 integer & sort i & search a no.which position
import java.util.Scanner;
public class Array_Int{
Scanner sc=new Scanner(System.in);
	int arr[]=new int [5];
	void input()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter a 5 times array element");
			arr[i]=sc.nextInt();
		}	
		
	}
     void disp()
	{
		for(int i=0;i<arr.length;i++)
		
		System.out.println(arr[i]);
	
	}
	void sort()
	{
		Arrays.sort(arr);
		System.out.println("arrays after sorting");
		System.out.println(Arrays.toString(arr));
	}
	void search()
	{
		System.out.println("enter a number to be search for index position");
		int index=Arrays.binarySearch(arr,sc.nextInt());
		index=index+1;
		System.out.println("index position is="+index);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Array_Int A=new Array_Int();
           A.input();
           A.disp();
           A.sort();
           A.search();
	}

}

