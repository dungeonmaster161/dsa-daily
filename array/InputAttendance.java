package array;

// Main class code
// public class Launch {

// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
// 		System.out.println("Hi welcome to problems we have array [11,22,33,44,55]");
// 		int arr[] = {11,22,33,44,55};
// 		Problems p = new Problems();
// 		p.sumOfAllElements(arr);
// 		p.printInReverseOrder(arr);
// 		p.sumOfAlternateElements(arr);
// 		p.reverseArray(arr);
// 	}

// }

public class Problems {
	public void separator() {
		System.out.print("\n\n--------------------------\n\n");
	}
	public void sumOfAllElements(int[] arr) {
		System.out.print("\n--------------------------\n");
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.print("Sum of array elements is "+sum);
		separator();
	}

	public void printInReverseOrder(int[] arr) {
		System.out.print("Elements in reverse orders are : ");
		System.out.print("[");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			if(i > 0 ) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		separator();
	}

	public void sumOfAlternateElements(int[] arr) {
		int sum = 0 ;
		for(int i=0;i<arr.length;i = i+2) {
			sum = sum + arr[i];
		}
		System.out.print("Sum of alternate elements is : "+sum);
		separator();
	}

	public void reverseArray(int[] arr) {
		// Using swapping approach
		int k = arr.length-1 , temp;
		for(int i=0;i<arr.length;i++) {
			temp =  arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			k--;
			if(k == arr.length/2) {
				break;
			}
		}
		System.out.println("Reverser Array using swapping is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1 ) {
				System.out.print(",");
			}
		}
		
		// using copy array approach
		int tempArr[] = {11,22,33,44,55};
		int newArr[] = new int[5];
		int j=0;
		for(int i=tempArr.length-1;i>=0;i--) {
			newArr[j] = tempArr[i];
			j++;
		}
		
		System.out.println("\nReverser Array using copy array is : ");
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]);
			if(i < arr.length-1 ) {
				System.out.print(",");
			}
		}
		
		
	}
}


package inputAttendance;

public class InputAttendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1,0,0,0,0,1,1};
		int minPercentageCriteria = 40;
		float presentDays = 0;
		float percentage ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				presentDays++;
			}
		}
		percentage = ( presentDays/(arr.length-1))*100;
		if(percentage > minPercentageCriteria) {
			System.out.println("Yes "+percentage+"%");
		}else {
			System.out.println("No "+percentage);
		}
		
	}

}


package arraySum;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = {5,6,3,2,1};
		int target = 9;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
			
			if( arr[i]+arr[j] == target ) {
				System.out.print(i+","+j);
				return;
			}
			}
			
		}
   }
}


package tasks;
import java.util.Scanner;
public class Shopkeeper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startWithOne = 50;
		int startWithTwo = 100;
		int firstDigit = 0 , price = 0 ;
		System.out.println("Enter product id");
		int productId = sc.nextInt();
		System.out.println("Enter No. of products");
		int numberOfProducts = sc.nextInt();
		while(productId!=0) {
			productId = productId/10;
			if(productId/10 == 0) {
				firstDigit = productId;
				break;
			}
		}
		if(firstDigit == 1) {
			price = numberOfProducts * 50;
		}else if(firstDigit == 2) {
			price = numberOfProducts * 100;
		}
		if(price>5000) {
			price = price - ((price*10)/100);
		}
		System.out.println("Final price of product is "+price);
	}

}
