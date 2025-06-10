package com.student.array;

public class Student {

	private String studentName;
	private int studentId;
	private String branch;
	private int marks;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", branch=" + branch + ", marks="
				+ marks + "]";
	}

	public Student(String studentName, int studentId, String branch, int marks) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.branch = branch;
		this.marks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Ayush", 123456, "IT", 96);
		Student s2 = new Student("Ram", 123456, "CS", 88);
		Student s3 = new Student("Rajesh", 156456, "IT", 89);
		Student s4 = new Student("Priya", 893456, "IT", 100);
		Student s5 = new Student("Najuka", 693456, "CS", 80);
		Student s6 = new Student("Sidhhi", 123586, "IT", 70);
		Student s7 = new Student("Pavan", 123256, "CS", 75);
		Student s8 = new Student("Sanvi", 453985, "IT", 98);
		Student s9 = new Student("Harshada", 003456, "IT", 78);
		Student s10 = new Student("Anuj", 1963456, "IT", 82);

		Student[] student = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };

		System.out.println("---------------All Student --------------------");

		for (Student stu : student) {

			if (stu.getBranch() == "IT") {
				System.out.println("IT Student : " + stu);
			}

		}
		System.out.println("--------------Only cs Student --------------------");

		for (Student stu : student) {

			if (stu.getBranch() == "CS") {
				System.out.println("CS Student : " + stu);
			}
		}
		System.out.println("------------------Cs Student only name ----------------");

		for (Student stu : student) {

			if (stu.getBranch() == "CS") {
				System.out.println("CS Student : " + stu.getStudentName());
			}
		}

		System.out.println("---------------Marks is greater than 85 ----------------------");

		for (Student stu : student) {
			if (stu.getMarks() >= 85) {
				System.out.println(
						" Top Student Name and Marks " + stu.getStudentName() + ",  " + " Mark is " + stu.getMarks());

			}
		}

		System.out.println(" ");
		System.out.println("---------------Avarage marks  ----------------------");
		System.out.println(" ");

		int sum = 0;
		int avg = 0;

		for (Student stu : student) {
			sum += stu.getMarks();
		}

		System.out.println("Sum of all Student : " + sum);
		avg = sum / student.length;

		System.out.println("Average marks is : " + avg);

		System.out.println(" ");
		System.out.println("--Student print name those have greater than average marks ----------------------");
		System.out.println(" ");

		for (Student stu : student) {
			if (stu.getMarks() >= avg) {
				System.out.println("Top Student " + stu.getStudentName());

			}

		}
		System.out.println(" ");
		System.out.println("--Top student all information  ----------------------");
		System.out.println(" ");

		for (Student stu : student) {
			if (stu.getMarks() >= avg) {
				System.out.println("Top Student " + stu);

			}

		}

	}

}
