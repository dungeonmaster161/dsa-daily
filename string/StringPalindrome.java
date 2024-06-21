package StringPalindrome;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome to Palindrom program---------------");
		System.out.println("Enter String One");
		String s1 = sc.next();
		System.out.println("Enter String Two");
		String s2 = sc.next();
		String s3 = "";
		for(int i=s2.length()-1;i>=0;i--) {
			s3 = s3+s2.charAt(i);  
		}
		if(s1.equals(s3)) {
			System.out.println("Input values are pallindrom");
		}else {
			System.out.println("Input values are not pallindrom");
		}
		sc.close();
	}

}
