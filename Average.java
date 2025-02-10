import java.util.Scanner;
class Average
{
public static void main (String []ar)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter first number = ");
int a = sc.nextInt();
System.out.println("enter second number = ");
int b = sc.nextInt();
System.out.println("enter third number = ");
int c = sc.nextInt();
System.out.println("enter fourth number = ");
int d = sc.nextInt();
int res = (a+b+c+d)/4;
System.out.println("average = "+res);
}
}
