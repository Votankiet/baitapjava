import java.lang.Math;
import java.util.*;

class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = {3, 5, 1, 2, 9, 10, 7, 1, 3};

        suLyDinhDang handler = new suLyDinhDang(arr, n);
        handler.formatAndPrint();
    }
}
// Bai so chinh phuong
final class soChinhPhuong {

    public static boolean isChinhPhuong(double number) {
        double sqrtNum = Math.sqrt(number);
        if(Math.floor(sqrtNum) == sqrtNum) return true;
        return false;
    }
}
// Bai xep loai hoc sinh
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
// Bai bien so thanh chu
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
//Bai tinh giai thua
final class toanHoc {
    public static int tinhGiaiThua(int number) {
        int res = 1;
        int count = 2;

        do {
            if(number == 0 || number == 1) break;
            res *= count++;
        }while(count <= number);

        return res;
    }
}
//Bai xoa phan tu trong mang va sap xep theo thu tu tang dan

class suLyDinhDang {
    private int tempArr[];
    private int elementToRemove;
    public suLyDinhDang(int[] _array, int x) {
        tempArr = _array;
        elementToRemove = x;
    }

    public void formatAndPrint() {
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] != elementToRemove) {
                arrList.add(tempArr[i]);
            }
        }
        System.out.println("Mang sau khi xoa x " + arrList.toString());
        Collections.sort(arrList);
        System.out.println("Mang sau khi sap xep" + arrList.toString());
    }
}