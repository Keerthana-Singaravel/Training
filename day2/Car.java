import java.util.Scanner;
class Car{
    String brand,model;
    int price;
    public Car(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void Display(){
        System.out.println("Car Details:");
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
    public void Discount(int discount){
        int discountprice=price-(price*discount)/100;
        System.out.println("Calculated Discount = "+discountprice);;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the car's brand , model and price :");
        String brand=sc.next();
        String model=sc.next();
        int price=sc.nextInt();
        Car c=new Car(brand,model,price);
        System.out.println("enter the discount:");
        int discount=sc.nextInt();
        c.Display();
        c.Discount(discount);
    }
}
