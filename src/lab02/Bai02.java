package lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao so nguyen a: ");
		int a = scanner.nextInt();

		System.out.println("Nhap vao so nguyen b: ");
		int b = scanner.nextInt();

		System.out.println("Nhap vao so nguyen c: ");
		int c = scanner.nextInt();

		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		if (a == 0) {
			// Phương trình trở thành b*x + c = 0
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				double x = -(double) c / b; // tránh chia số nguyên
				System.out.println("Phuong trinh mot nghiem duy nhat: " + x);
			}
		} else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = -(double) b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep: " + x);
			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng biet: " + "Nghiem x1 = " + x1 + " Nghiem 2: " + x2);
			}
		}

		scanner.close();
	}
}
