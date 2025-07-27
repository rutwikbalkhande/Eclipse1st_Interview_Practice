package Arrayclass;
import java.util.Scanner;
import java.util.Arrays;
public class Asending_order {
   static Scanner sc=new Scanner(System.in);
   
   static	int arr[]=new int [5];
	 void accept()
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("enter array element");
		arr[i]=sc.nextInt();
	}
		
	}
	 void disp()
	{
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	
	void setData()
	{
		Arrays.sort(arr);
		System.out.println("arrays after sorting");
		System.out.println(Arrays.toString(arr));
	}
	void search()
	{
		System.out.println("Enter A element to be searched ");
		int index=Arrays.binarySearch(arr,sc.nextInt());
		if(index<0)
			System.out.println("element is not found");
		else
			System.out.println("element is foundatindex position="+index);
	}
	
	public static void main(String[] args) {
		Asending_order A=new Asending_order();
		A.accept();
		A.disp();
		A.setData();
		A.search();
		
	
}
}