package lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao so dien: ");
		int soDien = scanner.nextInt();
		int soTien = 0;

		if (soDien <= 100) {
			soTien = soDien * 100;
		} else {
			soTien = 100 * 1000 + (soDien - 100) * 1500;
		}

		System.out.println("Vay voi so dien: " + soDien + " thi ban phai dong so tien la: " + soTien);
		scanner.close();
	}
}
