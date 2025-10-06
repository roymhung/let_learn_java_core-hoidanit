package lab04;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập tên sản phẩm: ");
		String name = sc.nextLine();

		System.out.print("Nhập giá sản phẩm: ");
		double price = sc.nextDouble();

		System.out.print("Nhập thuế (%): ");
		double tax = sc.nextDouble();

		// Tạo đối tượng Product
		Product pr1 = new Product(name, price, tax);

		// Xuất thông tin
		System.out.println(pr1);
		System.out.println("Thuế phải trả: " + pr1.getTaxPrice());

		sc.close();
	}
}
