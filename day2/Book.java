import java.util.Scanner;
public class Book {
    public String name,title;
    Book(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the tile and author of the book:");
        this.title=sc.nextLine();
        this.name=sc.next();
    }
    public void Display(){
        System.out.println("Title of the book:"+title);
        System.out.println("Author of the book:"+name);
    }
    public static void main(String [] args){
        Book b=new Book();
        b.Display();

    }
}
