import java.lang.Math;
import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(soChinhPhuong.isChinhPhuong(n)) {
            System.out.println("La so chinh phuong");
        }
        else {
            System.out.println("Khong la so chinh phuong");
        }
    }
}

final class soChinhPhuong {

    public static boolean isChinhPhuong(double number) {
        double sqrtNum = Math.sqrt(number);
        if(Math.floor(sqrtNum) == sqrtNum) return true;
        return false;
    }
}