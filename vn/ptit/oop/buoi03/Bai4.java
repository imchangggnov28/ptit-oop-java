package vn.ptit.oop.buoi03;
public class Bai4{
    public static int max(int a, int b){
        return Math.max(a,b);
    }

    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }

    public static int max(int[] a){
        int m = a[0];
        for (int x:a){
            if (x>m) m=x; 
        }
        return m;
    }

    public static double max(double... nums){
        double m = nums[0];
        for (double x:nums){
            if (x>m) m = x;
        }
        return m;
    }
    public static void main(String[] args){
       System.out.println(max(1,2));
    }
}