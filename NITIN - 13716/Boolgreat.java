import java.util.*;
public class Boolgreat {
 public static void main (String[]args)
 {
	 int a,b,c,d
	 ;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("enter the numbers");
	 a = new Scanner(System.in).nextInt();
	 b = new Scanner(System.in).nextInt();
	 c = new Scanner(System.in).nextInt();
	 d = new Scanner(System.in).nextInt();
	 {
		 if(a>b) {
			 System.out.println(a+" " +"is greatest");
		 }
		 else if(b>c) {
			 System.out.println(b+" "+"is greatest");
		 }
		 else {
			 System.out.println(c+" "+"is greatest");
		 }
	 }
 }
}
