import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = sc.nextInt();
        System.out.println("Nhập vào cạnh b");
        int b = sc.nextInt();
        System.out.println("Nhập vào cạnh c");
        int c = sc.nextInt();

        if ((a+b)>c || (a+c)>b || (b+c)>a) {
            System.out.println("Tam giác thường");
        }else if (a == b || a==c || b==c) {
            System.out.println("Tam giác cân");
        }else if ((a*a) == (b*b + c*c) || b*b == a*a + c*c || c*c == b*b +a*a) {
            System.out.println("tam giác vuông");
        }
    }
}
