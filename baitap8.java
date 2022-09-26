import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số abc");
        int inputNumber = Integer.parseInt(sc.nextLine());
        int a=inputNumber/100;
        int b=inputNumber%100;
        int c=b/10;
        int d=b%10;
        System.out.println("dao nguoc chuoi thanh : "+d+c+a);

    }
}
