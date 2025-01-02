package Day5;
enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
public class Days {
    public static void main(String [] args){
        Print(Day.Saturday);
        Print(Day.Monday);
        Print(Day.Wednesday);
    }
    public static void Print(Day d){
        switch(d){
            case Saturday,Sunday -> System.out.println(d+"It's WeekEnd.. ");
            default -> System.out.println(d+"It's WeekDay...");
        }
    }
}
