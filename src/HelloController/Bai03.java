package HelloController;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao canh cua lap phuong: ");
		int edge = scanner.nextInt();

		double theTich = Math.pow(edge, 3);
		System.out.println("The tích = " + theTich);
	}
}
