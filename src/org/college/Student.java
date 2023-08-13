package org.college;

public class Student extends Department{
	private void studentName() {
		System.out.println("studentName: KRK");		
	}
	private void studentDept() {
		System.out.println("studentDept: Mechanical Engg");		
	}
	private void studentId() {
		System.out.println("studentId: 9884336");		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.studentDept();
		s.studentId();
		s.studentName();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.hostalName();
		
	}
	

}
