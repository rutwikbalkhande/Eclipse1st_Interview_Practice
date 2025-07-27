package Arrayclass;
//3 method of decleare the array Different way of printing
public class Array_Basic_intro_Harry
{
	//1.method of Array
	int[]marks=new int[5];     //declearation + memeory allocation
	
       void first_method()
       {   
     //marks[index posi.]=marks  to store
    	   marks[0]=10;
    	   marks[1]=20;
    	   marks[2]=30;
    	   marks[3]=40;
    	   marks[4]=100;
    	   System.out.println("length of Array="+marks.length);       //display length of Array
   
   //1. display asending ord. total Array marks
    	   for(int i=0;i<marks.length;i++)                           
    	//for(int i=marks.length -1;i>=0;i--)                        //    reverse order
    		   System.out.println(marks[i]);
    	   
   //2. use index position marks display	   
    	   System.out.println("2nd index posi marks="+marks[1]);            
  
   //3. way   order printing
    	   System.out.println("printing using for each loop");
    	     for(int element:marks)                                  
    	   {
    		   System.out.println(element);
    	   }
    	   
       }
       
         //2.method of Array
 /*       void second_method()
	{  
		 
		int[]marks={1,2,40,80,50};                    //Declearation + { Initialisation }
		System.out.println("2nd length "+marks[2]);
   // for float
		float[]marks_std= {1.1f,20.0f,30.0f,40.0f};
  // String store
		String[]name= {"harray","rutwik","shubham","kahana"};
		System.out.println(name[2]);
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Basic_intro_Harry A=new Array_Basic_intro_Harry();
		A. first_method();
		//A. second_method();
	}

}
