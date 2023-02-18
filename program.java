import java.lang.Math;
import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        
        HocSinh hs = new HocSinh(n);

        hs.xepLoaiHocSinh();
        System.out.println(hs.getXepLoai());
    }
}

final class soChinhPhuong {

    public static boolean isChinhPhuong(double number) {
        double sqrtNum = Math.sqrt(number);
        if(Math.floor(sqrtNum) == sqrtNum) return true;
        return false;
    }
}

class HocSinh {
    private double soDiem;
    private String xepLoai;

    public HocSinh(double _soDiem) {
        soDiem = _soDiem;
    }

    public void xepLoaiHocSinh() {
        if(soDiem < 5.0) xepLoai = "Kem";
        else if (soDiem < 7.0) xepLoai = "TB";
        else if (soDiem < 8.0) xepLoai = "Kha";
        else xepLoai = "Gioi";
    }

    public String getXepLoai() {
        return xepLoai;
    }
}