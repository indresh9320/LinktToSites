package Test;

public class RecursionTest {

	static void printFun(int test) 
	{ 
	    if (test < 1) 
	        return; 
	    else
	    { 
	        System.out.printf("%d ",test); 
	        printFun(test-1); // statement 2 
	        System.out.printf("%d ",test); 
	        return; 
	    } 
	} 
	  
	public static void main(String[] args) 
	{ 
	    int test = 10; 
	    printFun(test); 
	} 

}
