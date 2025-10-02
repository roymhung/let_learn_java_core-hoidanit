package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao so nguyen a: ");
		int a = scanner.nextInt();

		System.out.println("Nhap vao so nguyen b: ");
		int b = scanner.nextInt();

		int x = -b / a;

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			System.out.println("Phuong trinh co nghiem: " + x);
		}

		scanner.close();
	}
}
