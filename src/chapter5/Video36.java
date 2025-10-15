package chapter5;

public class Video36 {
	public static void main(String[] args) {
		String word = "Banana";

		// Ký tự thứ 2 và cuối cùng
		System.out.println("Ký tự thứ 2: " + word.charAt(1));
		System.out.println("Ký tự cuối: " + word.charAt(word.length() - 1));

		// In tất cả 'n'
		System.out.print("Các ký tự 'n' tại index: ");
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'n') {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Đếm nguyên âm
		int vowels = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = Character.toLowerCase(word.charAt(i));
			if ("aeiou".indexOf(c) != -1) {
				vowels++;
			}
		}
		System.out.println("Số nguyên âm: " + vowels);
	}
}
