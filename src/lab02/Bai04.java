package lab02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		int tinhNang = scanner.nextInt();

		switch (tinhNang) {
		case 1:
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

			break;
		case 2:
			System.out.println("Nhap vao so nguyen a: ");
			int a1 = scanner.nextInt();

			System.out.println("Nhap vao so nguyen b: ");
			int b1 = scanner.nextInt();

			System.out.println("Nhap vao so nguyen c: ");
			int c = scanner.nextInt();

			double delta = Math.pow(b1, 2) - 4 * a1 * c;
			double x1 = (-b1 + Math.sqrt(delta)) / (2 * a1);
			double x2 = (-b1 - Math.sqrt(delta)) / (2 * a1);

			if (a1 == 0) {
				// Phương trình trở thành b*x + c = 0
				if (b1 == 0) {
					if (c == 0) {
						System.out.println("Phuong trinh co vo so nghiem");
					} else {
						System.out.println("Phuong trinh vo nghiem");
					}
				} else {
					double xb2 = -(double) c / b1; // tránh chia số nguyên
					System.out.println("Phuong trinh mot nghiem duy nhat: " + xb2);
				}
			} else {
				if (delta < 0) {
					System.out.println("Phuong trinh vo nghiem");
				} else if (delta == 0) {
					double xb2 = -(double) b1 / (2 * a1);
					System.out.println("Phuong trinh co nghiem kep: " + xb2);
				} else {
					System.out.println(
							"Phuong trinh co 2 nghiem rieng biet: " + "Nghiem x1 = " + x1 + " Nghiem 2: " + x2);
				}
			}
			break;
		case 3:
			System.out.println("Nhap vao so dien: ");
			int soDien = scanner.nextInt();
			int soTien = 0;

			if (soDien <= 100) {
				soTien = soDien * 100;
			} else {
				soTien = 100 * 1000 + (soDien - 100) * 1500;
			}

			System.out.println("Vay voi so dien: " + soDien + " thi ban phai dong so tien la: " + soTien);
			break;
		case 4:
			System.out.println("Ket thuc chuong trinh");
			break;
		default:
			System.out.println("loi ngoai chuong trinh");
		}
		scanner.close();
	}
}
