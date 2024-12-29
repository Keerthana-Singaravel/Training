import java.util.Scanner;
public class PrintNums_Skips5Mul {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<100;i++){
            if(i%5==0){
                continue;
            }
            else{
                System.out.print(i+" ");;
            }
        }
    }
}
