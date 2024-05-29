/**
 * 
 *   0    
 *   01   
 *   024  
 *   0369 
 *   0481216
 */
class Patttern31{
    public static void main(String[] args){
        int i,j,k;
        int n = 5;
        for(i=1;i<=n;i++){
            k=0;
            for(j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(k);
                    k = i-1+k;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
    }
}