
package praclang;
import java.util.*;
public class char4 {
	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		    int numEntry;
		    int num;
		    int total = 0;
		    int fnalave;
		   
		    int[]numGrades={87,90,77,89,88,94,95,83,82,75};
		    
		    System.out.println ("Enter Array Length:");
		    numEntry = read.nextInt();
		    
		    if (numEntry > numGrades.length){
		        System.out.println("Invalid Entry!");   
		    }else {
		    	for(int i = 0; i <= numEntry-1; i++) {
		    		System.out.println("The Grade " + (i+1) + " is " + numGrades[i]);
		    		total = total + numGrades[i];	
		    	} 
                   
		    	fnalave = total/numEntry;
		    	
		    	System.out.println("The Average is: " + fnalave);
				if(fnalave <= 77) {
					System.out.println("Remark is Failed");
				}else{
					System.out.println("Remark is Passed");
				}
                   
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
