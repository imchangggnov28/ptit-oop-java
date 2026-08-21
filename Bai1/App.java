package Bai1;
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = sc.nextLine();
        Greeter gt = new Greeter(name);
        gt.greet();
        sc.close();
    }
}