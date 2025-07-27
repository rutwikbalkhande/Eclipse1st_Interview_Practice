package Arrayclass;
//total sum of array
public class Sum_Array {
	
  int arr[]= {2,5,8,4,6,8};
  void sum()
  { 
	  int s=0;
	  for(int i=0;i<arr.length;i++)
		  s=s+arr[i];
	  System.out.println(s);
	  
  }
	public static void main(String[] args) {
		Sum_Array A=new Sum_Array();
		A.sum();
	}

}
