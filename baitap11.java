import java.util.Scanner;

public class baitap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien da dung!");
        int inputDien = sc.nextInt();
        int tong=0;

        if (inputDien<=50) {
            tong=700*inputDien+10000;
            System.out.println("so tien phai tra khi dung "+inputDien+" so dien la :"+tong+" Vnd");
        } else if (inputDien<=100) {
            tong=35000+(inputDien-50)*900+10000;
            System.out.println("so tien phai tra khi dung "+inputDien+" so dien la :"+tong+" Vnd");
        } else if (inputDien<=150) {
            tong=80000+(inputDien-100)*1100+10000;
            System.out.println("so tien phai tra khi dung "+inputDien+" so dien la :"+tong+" Vnd");
        }else if (inputDien>150){
            tong=135000+(inputDien-150)*1300+10000;
            System.out.println("so tien phai tra khi dung "+inputDien+" so dien la :"+tong+" Vnd");
        }else
            System.out.println("hay nhap so dien lon hon 0");
    }
}
