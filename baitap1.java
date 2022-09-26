import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        //nhập vào cạnh a
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a hình vuông");
        int a = sc.nextInt();
        System.out.println("Chu vi hình vuông là:" + (a * 4));
        System.out.println("Diện tích hình vuông là:" + (a*a));
    }
}
