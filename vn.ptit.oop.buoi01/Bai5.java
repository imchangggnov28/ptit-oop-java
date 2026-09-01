/**
 * Họ và tên: Hoàng Thị Huyền Trang
 * Mã sinh viên: N24DCCN083
 * Lớp: D24CQCN01-N
 * Ngày nộp: 22/08/2026
*/
import java.util.stream.IntStream;
public class Bai5 {
    public static void main (String[] args){
       System.out.println("(a):");
       System.out.println("1 2 3 4");
       System.out.println("(b):");
       System.out.print(1+ " ");
       System.out.print(2+ " ");
       System.out.print(3+ " ");
       System.out.print(4+ " ");
       System.out.println("");
       System.out.println("(c):");
       System.out.printf("%d %d %d %d%n", 1, 2, 3, 4 );
       System.out.println("(d)");
       System.out.println(String.join(" ", "1", "2", "3", "4"));
       System.out.println("(e):");
       IntStream.rangeClosed(1,4).forEach(i->System.out.print(i+ " "));
    }
}
