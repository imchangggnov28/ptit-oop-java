import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*Dung if - else */
        System.out.println("Dung if-else: ");
        if (a>b){
            System.out.println(a+">"+b);
        }
        else if (a<b){
            System.out.println(a+"<"+b);
        }
        else{
            System.out.println(a+"="+b);
        }
        /*Dung toan tu*/
        String result = (a==b)?a+"="+b:((a>b)?a+">"+b:a+"<"+b);
        System.out.println("Dung toan tu: ");
        System.out.print(result);
        sc.close();
    }
}
