import java.util.Scanner;

public class baitap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so giay !");
        int change = sc.nextInt();

        int   hours = change/3600;
        int minutes =(change%3600)/60;
        int seconds = change-(hours*3600+minutes*60);
        System.out.println("time la :"+ hours +" gio "+minutes+" phut "+seconds+" giay ");
    }
}
