package Arrayclass;

import java.util.Arrays;
import java.util.HashSet;

//femove dublicete ele from array using HashSet

public class Dublicae_Remove {
	 int arr[]= {1,2,2,3,4,5,6,6};
	 
	void disp()
	{
		for(int i=0;i<1;i++) {
			
		System.out.println(Arrays.toString(arr));
	}
		
	}
	void remove() {
		HashSet<Integer> hs=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println("After Dublicate Removing");
		System.out.println(hs);
	}
	public static void main(String[] args) {
		Dublicae_Remove a =new Dublicae_Remove ();
            a.disp();
            a.remove();
	}

}
