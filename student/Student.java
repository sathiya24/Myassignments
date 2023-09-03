package org.student;
import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("student name - sathya");
	}
	public void studentDept() {
		System.out.println("studentdept - EEE");
	}
	public void studentId() {
		System.out.println("Studentid - 2435");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();	
	}
	

}
