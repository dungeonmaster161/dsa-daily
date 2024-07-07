package practiceString;
import java.util.Scanner;
public class StringSkip {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int temp;
			String s = "abcYZasdds";
			String finalString = "";
			System.out.println("Enter number of steps you want to shift");
			byte n = sc.nextByte();
			byte[] ba  = s.getBytes();
			for(int b : ba) {
				if(b>=65 && b<=90) {
					b=b+n;
					if(b>90) {
					temp = b-90-1;
					finalString = finalString+(char)(temp+65);
					}else {
						finalString = finalString+(char)b;	
						System.out.println(finalString);
						break;
					}
				}else{
					b=b+n;
					if(b>122) {
					temp = b-122;
					finalString =finalString+(char)(temp+97);
					}else {
						finalString =finalString+(char)b;	
					}
				}
			}
			System.out.println(finalString);
			sc.close();
	}

}
