package Day5;

public class ArrayElements {
    public static void main(String [] args){
       String[] StrArray={"India","America","Japan"};
       System.out.print("String Array: ");
        Print(StrArray);

        Integer[] IntArray={17,55,44};
        System.out.print("Integer Array: ");
        Print(IntArray);

        Double[] DobArray={5.6,7.8,3.4};
        System.out.print("Double Array: ");
        Print(DobArray);
    }
    public static <S> void Print(S[] array){
        for(S ele : array){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
