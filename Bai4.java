import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Fahrenheit: ");
       float fahrenheit = sc. nextFloat();
       System.out.printf("Celsius= %.2f\n",(fahrenheit-32)*5.0/9.0); 
       sc.close(); 
}
}
