import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so nam!");
        int inputYear = sc.nextInt();

        System.out.println("nhap so thang!");
        int inputMonth = sc.nextInt();

        switch (inputMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay");
                break;
            case 2:
                if (inputYear % 4 == 0 && inputYear % 100 != 0 ||
                        inputYear % 400 == 0){
                    System.out.println("thang co 29 ngay");
                }else
                    System.out.println("thang co 28 ngay");
        }
    }
}
