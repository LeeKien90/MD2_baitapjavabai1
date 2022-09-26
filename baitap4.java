import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào thông tin sinh viên");
        System.out.println("Mã Sinh viên");
        String studentId = sc.nextLine();
        System.out.println("Tên sinh viên");
        String studentName = sc.nextLine();
        System.out.println("Tuổi sinh viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Giói tính sinh viên");
        boolean sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Email sinh viên");
        String email = sc.nextLine();
        System.out.println("Số điện thoại sinh viên");
        int soDienThoai = Integer.parseInt(sc.nextLine());
        System.out.println("Địa chỉ sinh viên");
        String address = sc.nextLine();
        System.out.println("*******************STUDENT INFORMATION******************");
        System.out.printf("Student ID: %s   Student Name: %s       Age: %d \n", studentId,studentName,age);
        System.out.printf("Gender: %b      Email: %s    Phone: %d \n", sex,email,soDienThoai);
        System.out.printf("Address: %s",address);
    }
}
