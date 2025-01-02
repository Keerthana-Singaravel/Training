package Day5;

public class VarArgs {
    public static void main(String [] args){
        System.out.println("No elements :"+sum());
        System.out.println("5 Arguments :"+sum(3,5,6,7,1));
        System.out.println("3 Arguments :"+sum(9,2,5));
    }
    public static int sum(int... num){
        int sum=0;
        for(int n:num){
            sum+=n;
        }
        return sum;
    }
}
