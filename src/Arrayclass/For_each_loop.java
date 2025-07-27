package Arrayclass;

public class For_each_loop {
	
     String[]name= {"rutwik","harry","khanha","shubham","jay"};
        void disp()
    {
        	//forEach() method can be used to iterate objects from collection
        	//for each loop only use in array
	    for(String student:name)              
		System.out.println("name is "+student);     
	      System.out.println("length is "+name.length);

        }



	           public static void main(String[] args) {
		
		          For_each_loop f=new For_each_loop();
		        		f.disp();
	      }

           }
