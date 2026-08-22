import java.util.Scanner;
public class Bai3 {
    public static void main (String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Hay nhap 2 so a va b: ");
          double a = sc.nextDouble();
          double b = sc.nextDouble();
          if (b ==0 ){
            System.out.print("b=0, a khong phai la boi cua b");
          }
          else{
            if(a%b==0){
                System.out.print("a la boi cua b");
            }
            else{
                System.out.print("a khong la boi cua b");
            }
          }
          sc.close();
    }
}
