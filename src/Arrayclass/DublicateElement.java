package Arrayclass;
import java.util.Arrays;

public class DublicateElement {
//find dublicate elements from Array
	
	int []arr= {10,20,30,40,50,70,10,30,40};
	
	void dub_Element()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
					System.out.println(arr[i]);
				
			
		}}
		
	}
	public static void main(String[] args) {
		
		DublicateElement d=new DublicateElement();
		d.dub_Element();
	}

}
/*
package Arrayclass;
import java.util.Arrays;

public class DublicateElement {
    int[] arr = {10, 20, 30, 40, 50, 70, 10, 30, 40};

    void dubli() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        DublicateElement d = new DublicateElement();
        d.dubli();
    }
}*/
