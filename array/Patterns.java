package com.Patterns;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern5();
//		pattern6();
		pattern7();
	}
	
	public static void pattern5() {
		/**
		       *    
		 	  * *   
             * * *  
            * * * * 
           * * * * *
		*/
		int i,j,c=9,r=5;
		boolean k ;
		for(i=1;i<=r;i++) {
			k=true;
			for(j=1;j<=c;j++) {
				if(j>=r-i+1 && j<=r+i-1 && k ){
//					if(i%2 == 0) {
////						if(j%2==0) {
////							System.out.print("*");
////						}else {
////							System.out.print(" ");
////						}
//					}else {
////						if(j%2!=0) {
////							System.out.print("*");
////						}else {
////							System.out.print(" ");
////						}
//					}
					System.out.print("*");
					k=false;
				}else {
					System.out.print(" ");
					k=true;
				}
			}
			System.out.println("");
		}
		
	}
	
	public static void pattern6(){
		/*
		    **** ****
			***   ***
			**     **
			*       *
		 * */
		int i,j,n=4;
		for(i=1;i<=n;i++) {
			for(j=1;j<=9;j++) {
				if(j<=n-i+1 || j>=n+i+1) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void pattern7() {
		/*
   1   
  121  
 12321 
1234321

		 */
		int i,j,n=4,k;
		for(i=1;i<=n;i++) {
			k=1;
			for(j=1;j<=7;j++){
				if(j>=n-i+1 && j<=n+i-1) {
					System.out.print(k);
					if(j>n-1)
					{
						k--;
					}else {
						k++;
					}

				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
