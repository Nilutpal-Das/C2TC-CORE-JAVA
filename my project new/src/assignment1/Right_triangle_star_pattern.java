package assignment1;

public class Right_triangle_star_pattern {

	public static void main(String[] args) {
		 
		int i, j, row=5;   
		 //outer loop for rows 
		  for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		    for(j=0; j<=i; j++)   
		    {   
		//prints stars   
		     System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		     System.out.println();   
		}   
	}   
}  
		

	


