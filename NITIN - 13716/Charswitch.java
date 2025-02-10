import java.util.*;
public class Charswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char letter;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the character");
       letter = sc.next().charAt(0);
       
       switch(letter) {
       case 'a': System.out.println("vowels");
       break;
       case 'e': System.out.println("vowels");
       break;
       case 'i': System.out.println("vowels");
       break;
       case 'o': System.out.println("vowels");
       break;
       case 'u': System.out.println("vowels");
       break;
       case 'A','E','I','O','U': System.out.println("vowels");
       break;
       default: System.out.println("consonent");
       break;
       }
	}

}
