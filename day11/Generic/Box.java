package Day11.Generic;

public class Box <T>{
    private T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;
    }
    public void printItem(){
        if(item!=null){
            System.out.println("Item :"+item.toString());
        }
    }
    public boolean isTypeOf(Class <?> type){
        return type.isInstance(item);
    }
    public static void main(String [] args){
        Box<String> str=new Box<>();
        str.setItem("Hello");
        str.printItem();
        System.out.println("Is it is String ?"+str.isTypeOf(String.class));
        System.out.println("Is it is Integer ?"+str.isTypeOf(Integer.class));

        Box<Integer> i=new Box<>();
        i.setItem(123);
        i.printItem();
        System.out.println("Is it is Integer ?"+i.isTypeOf(Integer.class));
    }
}
