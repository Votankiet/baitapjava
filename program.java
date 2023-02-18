import java.lang.Math;
import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        soHangTram s = new soHangTram(n);

        System.out.println(s.toString());
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

class soHangTram {
    private String digit[] = {"", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
    private int donVi;
    private int chuc;
    private int tram;

    public soHangTram(int number) {
        int store[] = new int[3];
        int i = 0;
        while(number > 0) {
            store[i] = number % 10;
            number /= 10;
            i++;
        }
        tram = store[2];
        chuc = store[1];
        donVi = store[0];
    }

    public String toString() {
        String temp = "";
        if(tram != 0) temp += (digit[tram] + " Tram");
        if(chuc == 0 && donVi != 0) temp += " Le";
        else {
            if(chuc == 1) temp += " Muoi";
            else if(chuc != 0) temp += (" " + digit[chuc] + " Muoi");
        }
        temp += (" " + digit[donVi]);

        return temp;
    }
}