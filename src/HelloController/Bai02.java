package HelloController;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		// Tính toán và in ra console:
		// - chu vi hình chữ nhật
		// - diện tích hình chữ nhật
		// - cạnh nhỏ nhất của hình chữ nhật
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap vao chieu rong HCN: ");
		int width = scanner.nextInt();
		System.out.print("Nhap vao chieu dai  HCN: ");
		int length = scanner.nextInt();

		int perimeter = (width + length) * 2;
		System.out.println("Ket qua chu vi HCN: " + perimeter);

		int charge = (width * length);
		System.out.println("Ket qua dien tich HCN: " + charge);

		System.out.println("Ket qua canh nho nhat HCN: " + Math.min(width, length));

	}
}
