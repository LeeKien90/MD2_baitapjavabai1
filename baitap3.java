import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao số nguyên a");
        float a = sc.nextFloat();
        System.out.println("Nhập vào số nguyên b");
        float b = sc.nextFloat();
        float cong, tru, nhan, chia;
        cong = a+b;
        tru = a-b;
        nhan = a*b;
        chia = a/b;
        System.out.printf("Cộng: %f, Trù: %f, Nhân: %f, Chia: %f", cong,tru,nhan,chia);

    }
}
