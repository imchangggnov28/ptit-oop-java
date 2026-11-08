import java.util.Scanner;
public class Bai1{
    public static double sphereVolume(double radius){
        if (radius < 0){
            throw new IllegalArgumentException ("Ban kinh khong duoc la so am.");
        }
        return (4.0/3.0)*Math.PI * Math.pow(radius,3);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh cau: ");
        try{
            double radius = sc.nextDouble();
            double theTich = sphereVolume(radius);
            System.out.printf("The tich hinh cau ban kinh %.2f la: %.4f",radius,theTich);
        }
        catch (IllegalArgumentException e){
            System.out.print("Loi: "+ e.getMessage());
        }
        catch (Exception e){
            System.out.print("Vui long nhap so hop le!");
        }
        finally {
            sc.close();
        }
        }
    }