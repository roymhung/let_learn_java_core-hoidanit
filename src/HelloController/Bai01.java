package HelloController;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = scanner.nextLine();

		System.out.println("Nhap diem: ");
		int score = scanner.nextInt();

		System.out.println(name + " co diem = " + score);
		scanner.close();
	}
}
