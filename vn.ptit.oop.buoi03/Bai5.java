import java.util.Scanner;
public class Bai5{
    public static double avg(double[] a,int n){
        double sum = 0;
        for(double x:a){
            sum+=x;
        }
        return sum/n;
    }

    public static double max (double[] a){
        double m = a[0];
        for (double x:a){
            if(x>m) m=x;
        }
        return m;
    }

    public static double min(double[] a){
        double m = a[0];
        for(double x:a){
            if(x<m) m=x;
        }
        return m;
    }

    public static double doLechChuan(double[] a,int n){
        double sum = 0;
        for(double x:a){
            sum+=Math.pow(x-avg(a,n),2);
        }
        return Math.sqrt(sum/n);
    }

    public static void main(String[] args){
        int n=0;
        double[] a =new double[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem (toi da 20 diem). Nhap -1 de dung.");
        while(n<20){
            double input = sc.nextDouble();
            if(input==-1) break;
            a[n++]=input;
        }
        System.out.printf("""
                          ============BANG THONG KE===========
                           1.Diem trung binh: %.2f
                           2.Diem cao nhat: %.2f 
                           3.Diem thap nhat: %.2f
                           4.Do lech chuan: %.2f """,avg(a,n),max(a), min(a), doLechChuan(a,n));
        System.out.println("""
                                         BIEU DO COT
                           ======================================""");
        for(int i=0; i<n;i++){
            System.out.printf("SV %d\n",i+1);
            for(int j=0;j<a[i];j++){
                System.out.println("  #\n");
            }
        }
    }
}