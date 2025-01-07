package Day9;
import java.util.Scanner;
import java.util.Vector;
public class StudentMark {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<Integer>();
        System.out.println("enter 0 to stop entering marks:");
        int mark=0;
        while(true){
            System.out.println("enter the grade: ");
            mark=sc.nextInt();
            if(mark==0){
                break;
            }
            v.add(mark);
        }
        System.out.println("Grade:"+v);

        System.out.println("enter the index to remove mark:");
        int j=sc.nextInt();
        v.remove(j);

        int max=0,min=Integer.MAX_VALUE,sum=0;
        for(int i:v){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
            sum+=i;
        }
        int avg=sum/v.size();
        System.out.println("Highest Mark: "+max);
        System.out.println("Average Mark: "+avg);
        System.out.println("Lowest Mark: "+min);


    }
}
