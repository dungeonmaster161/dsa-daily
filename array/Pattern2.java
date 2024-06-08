/**
*       *
       **
      ***
*    ****
*   *****
 */
public class Pattern2 {
    public static void main(String[] args) {
        int n,i,j;
        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j>n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
