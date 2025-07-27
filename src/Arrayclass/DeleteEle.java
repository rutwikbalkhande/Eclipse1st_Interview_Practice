package Arrayclass;
import java.util.Scanner;
import java.util.Arrays;

public class DeleteEle {
	Scanner sc=new Scanner(System.in);
	
	int arr[]=new int[3];
	int size=arr.length;
	void input() {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number");
		  arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
	}
	void removeEle() {
		 System.out.println("Enter the element to delete: ");
	        int elementToDelete = sc.nextInt();
	        boolean found = false;

	        for (int i = 0; i < size; i++) {
	            if (elementToDelete == arr[i]) {
	                found = true;       
	                // Shift elements to the left to overwrite the deleted element
	               
	                for (int j = i; j < size - 1; j++) {
	                    arr[j] = arr[j + 1];
	                }
	                size--; // Decrease the size of the array
	            }
	        }

	        if (found==true) {
	          //  System.out.println("Array after deleting " + elementToDelete + ": " + Arrays.toString(Arrays.copyOf(arr, size)));
		           System.out.println(Arrays.toString(arr)+"Array after deleting "  );

	        } else {
	            System.out.println("Element not found in the array.");
	     
	}}

	public static void main(String[] args) {
		DeleteEle d=new DeleteEle ();
		d.input();
		d. removeEle()  ;
	}

}
