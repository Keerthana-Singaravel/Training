package Day7;
import java.util.Scanner;
public class MinCostChip {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        int min=Math.min(even,odd);
        System.out.println("Minimum cost="+min);
    }
}
