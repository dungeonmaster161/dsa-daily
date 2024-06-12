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
