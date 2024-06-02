public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5();
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

}
