package chapter6.vieo54;

public class Video54 {
	public static void main(String[] args) {
		Employee nv1 = new Employee();
		nv1.name = "roy";
		nv1.salary = 15;

		Employee nv2 = new Employee();
		nv2.name = "kk";
		nv2.salary = 12;

		nv1.showInfo();
		System.out.println("------------------------");
		nv2.showInfo();
	}
}
