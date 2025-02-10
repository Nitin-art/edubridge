import java.util.*;
class Rectangle
{
static int Methname(int a, int b)
{
return (a*b);
}
public static void main (String [] ar)
{
Scanner sc = new Scanner(System.in);
int res = Methname(sc.nextInt(), sc.nextInt());
System.out.println("area of rectangle is " +res);
}
}

