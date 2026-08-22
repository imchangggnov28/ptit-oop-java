/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.Scanner;
import java.time.Duration;
public class Bai8 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap tong so giay: ");
    long ss = sc.nextLong();
    long date = ss/(24*3600);
    long remainingSec = ss%(24*3600);
    long hh = remainingSec/3600;
    remainingSec = remainingSec%3600;
    long mm = remainingSec/60;
    remainingSec = remainingSec%60;
    

    System.out.printf("Khong dung Duration: %d ngay %02d:%02d:%02d\n", date,hh,mm,remainingSec);
//dung duration:
    Duration drt = Duration.ofSeconds(ss);
    long days = drt.toDaysPart();
    long hours = drt.toHoursPart();
    long minutes = drt.toMinutesPart();
    long sec = drt.toSecondsPart();
    System.out.printf("Dung duration: %d ngay %02d:%02d:%02d",days,hours,minutes,sec);   
    sc.close();
    }
}
