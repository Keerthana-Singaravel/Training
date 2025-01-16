package Day12.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileName {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String fn="KeerthanaSingaravel.txt";
        try (FileWriter w=new FileWriter(fn)){
            System.out.println("File Created : "+fn);
        }catch(IOException e){
            System.out.println("error occured ...");
        }
    }
}
