package HelloController;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your name is: ");
        String name = scanner.nextLine();
        System.out.print("your age is: ");
        int age = scanner.nextInt();
        System.out.println("My name is " + name + ", age = " + age);
        scanner.close();
    }
}
