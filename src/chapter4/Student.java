package chapter4;

public class Student {

	// class attributes (thuộc tính của lớp)
	String name;
	int age;
	String fullname;
	String firstName;
	String emailAddress;

	// class method (phương thức của lớp)
	void learnJava() {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

	String getAge() {
		// Thay vì trả về "Hỏi Dân IT", bạn nên trả về giá trị age
		// return String.valueOf(age);
		return "Hỏi Dân IT";
	}
}
