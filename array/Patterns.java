package patterns;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern5();
//		pattern6();
//		pattern7();
//		pattern8();
//		pattern9();
//		pattern10();
//		pattern11();
//		pattern12();
//		pattern13();
//		pattern14();
		// pattern15();
		pattern16();
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
	public static void pattern8() {
		/*
		  * ABCDCBA
			ABC CBA
			AB   BA
			A     A

		 */
		int i,j,n=4;
		char k;
		for(i=1;i<=n;i++) {
			k='A';
			for(j=1;j<=7;j++) {
				if(j<=n-i+1 || j>=n+i-1) {
					System.out.print(k);
					if(j>=n) {
						k--;
					}else {
						if(j!=n-i+1 || j>=n+i-1)
						{
							k++;
						}	
					}
				}else {
					System.out.print(" ");
					
				}
			}
			System.out.println("");
		}
	}
	
	public static void pattern9() {
		/*
		   *   
		  ***  
		 ***** 
		*******
		 ***** 
		  ***  
		   *   

		 */
		int i,j,k=0;
		for(i=1;i<=7;i++) {
				if(i<=4) {
					k++;
				}else {
					k--;
				}
			for(j=1;j<=7;j++) {
				if(j>=5-k && j<=3+k) {
					System.out.print("*");
				
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern10() {
		int i,j,k=0;
		for(i=1;i<=7;i++) {	
			if(i<=4) {
				k++;
			}else {
				k--;
			}
			for(j=1;j<=4;j++) {		
				if(j<=k){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void pattern11() {
		/**
		*******
		 ***** 
		  ***  
		   *   

		 */
		int i,j,n=7;
		for(i=1;i<=4;i++) {
			for(j=1;j<=7;j++) {
				if(j>=i && j<=n-i+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}
	}
	
	public static void pattern12() {
		/*
		   1   
		  232  
		 34543 
		4567654

		 */
		int i,j,k=1,count=1,mem;
		for(i=1;i<=4;i++) {
			k=i;
			mem = i;
			count=1;
			for(j=1;j<=7;j++) {
				if(j>=5-i && j<=5+i-2) {
					System.out.print(k);
					
					if(count >= mem ) {
						k--;
					}else {
						k++;
					}
					count++;
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void pattern13(){
		/**
		6543210
		543210 
		43210  
		3210   
		210    
		10     
		0      

		 */
		int i,j,k = 7 ,temp ;
		for(i=1;i<=7;i++) {
			temp = k;
			for(j=1;j<=7;j++) {
				if(j<=k) {
					System.out.print(--temp);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			k--;
		}
	}
	
	public static void pattern14() {
		/*
		 *      1    
			   12    
			  123    
			 1234    
			12345    
			 1234    
			  123    
			   12    
			    1    

		 */
		int n = 5 , i , j , k=0, num=1;
		for(i=1;i<=9;i++) {
			if(i>5) {
				k--;
			}else {
				k++;
			}
			num=1;
			for(j=1;j<=9;j++) {
				if(j>=(n-k+1) && j<=n) {
					System.out.print(num);
					num++;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void pattern15() {
		/*
		*********
		**** ****
		***   ***
		**     **
		*       *
		**     **
		***   ***
		**** ****
		*********
		 */
		int i,j,k=0;
		for(i=1;i<=9;i++) {
			if(i>5) {
				k--;
			}else {
				k++;
			}
			for(j=1;j<=9;j++) {
				if(j<=6-k || j>=4+k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void pattern16() {
	       
		//		   A   
		//		  ABA  
		//		 ABCBA 
		//		ABCDCBA
		
				int i,j,k=1;
				char c ;
				for(i=1;i<=5;i++) {
					c ='A';
					k=1;
					for(j=1;j<=7;j++) {
						if(j>5-i && j<3+i) {
							System.out.print(c);
							if(j<4) {
								c++;
							}else {
								c--;
							}
							
						}else {
							System.out.print(" ");
						}
						k++;
					}
					System.out.println("");
				}
			}
		

}