/*
public class LowercaseLtters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String name = "nNiItTiInN";
            for(char c : name.toCharArray()) {
            	if (Character.isLowerCase(c)) {
            		System.out.print(c + " ");
            	}
            }
	}
}
*/

import java.util.*;
public class LowercaseLtters {
	public static void main(String[] args) {
int size;
Scanner sc = new Scanner (System.in);
int esum=0,osum=0;
char[] arr1=new char[5];
System.out.println("enter the name");
String name=sc.next();
for(int i=0;i<arr1.length;i++)
{
arr1=name.toCharArray();
}
for(int i=0;i<arr1.length;i++) { 
if(arr1[i]>=97 && arr1[i]<=122)
System.out.println(arr1[i]+ " ");
}
System.out.println("Odd ---->"+osum+"EvenSum ---->"+esum);
}
}