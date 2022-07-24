package Day02_String_DateTime_Scanner;

import java.util.Scanner;

public class About_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int intNumber = scanner.nextInt();
        System.out.println("Bạn đã nhập: " + intNumber);

        scanner.nextLine(); // Thêm dòng này để không bị tràn lệnh sau khi nhập vào một số (kiểu int, double, v.v.)
        System.out.print("Nhập một xâu ký tự (không dấu): ");
        String inputText = scanner.nextLine();
        System.out.println("Bạn đã nhập: " + inputText);

        scanner.close();
    }
}