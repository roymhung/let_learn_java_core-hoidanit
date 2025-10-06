package chapter4;

public class Student {

	// class attributes (thuộc tính của lớp)
	private String name;
	private int age;

	String fullname;
	String firstName;
	String emailAddress;

	// contructor: ham tao
	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class method (phương thức của lớp)
	void learnJava() {
		System.out.println("Learn Java with Youtube Hỏi Dân IT");
	}

}
