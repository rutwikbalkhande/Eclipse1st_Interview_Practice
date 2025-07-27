package Arrayclass;
import java.util.Scanner;
public class Array_2D_Array {
	
static Scanner sc=new Scanner(System.in);

int row=sc.nextInt();
int colms=sc.nextInt();

int arr[][]=new int[row][colms];

void setData()
{
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<colms;j++)
		{
			System.out.println("enter a data(value of row & column ");
			arr[i][j]=sc.nextInt();
		}
	}
}
void getData()
{
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<colms;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println( );
	}
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a no.of row & column");
		Array_2D_Array d=new Array_2D_Array();
            	d.setData();
             	d.getData();
	}

}
