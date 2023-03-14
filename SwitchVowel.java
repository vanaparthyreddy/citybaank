import java.util.Scanner;

public class SwitchVowel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter an vowel ");
		char c=s.next().charAt(0);
		switch(c)
		{
		case 'a','A','e','E','i','I','o','O','u','U':
			System.out.println("vowel");
			break;
		default: 
			System.out.println("consonant");
		}
	}

}
