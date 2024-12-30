public class Calculators {
    public void add(int a,int b){
        int sum=a+b;
        System.out.println("Sum of 2 integers: "+sum);
    }
    public void add(double a,double b){
        double sum=a+b;
        System.out.println("sum of 2 doubles : "+sum);
    }
    public void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Sum of 3 integers : "+sum);
    }
    public static void main(String [] args){
        Calculators s=new Calculators();
        s.add(5,6);
        s.add(4.4,7.9);
        s.add(5,7,9);
    }

}
