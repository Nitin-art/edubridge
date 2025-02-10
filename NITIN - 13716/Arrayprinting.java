import java.util.*;
public class Arrayprinting {
    public static void main(String []args) {
    	int row, col;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the value for row and col");
    	row = sc.nextInt();
    	col = sc.nextInt();
    	int marks [][]= new int [row][col]; {
    		
    	System.out.println("enter the value of array");
    	
    	for(int i=0; i<row;i++)
    	{
    		for(int j=0;j<col;j++) {
    			marks[i][j]=sc.nextInt();
    		}
    	}
    	System.out.println("array values are");
    	for(int i=0; i<row;i++)
    	{
    		for(int j=0;j<col;j++) {
    			System.out.print(marks[i][j]+" ");
    		}
    	System.out.println();
    }
}
}
}