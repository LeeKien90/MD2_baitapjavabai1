import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner chieuDai = new Scanner(System.in);
        System.out.println("NHập chiều dài hình chũ nhật");
        Scanner chieuRong = new Scanner(System.in);
        System.out.println("Nhập chiều rộng hình chữ nhật");
        int a = chieuDai.nextInt();
        int b = chieuRong.nextInt();
        System.out.println("Chu vi hình chữ nhật là:" + (a+b)*2);
        System.out.println("Diện tích hình chữ nhật là:" + (a*b));
    }
}
