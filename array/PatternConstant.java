import java.util.Scanner;

/**
 * PatternConstant
 *   ****
 *   ****
 *   ****
 *   ****
 */
public class PatternConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns you want to print : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
