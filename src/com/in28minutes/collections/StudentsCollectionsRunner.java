package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionsRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Namo"), new Student(100, "JD"), new Student(2, "Leo"));
		List<Student> studentAl = new ArrayList<>(students);

		System.out.println(studentAl);
		Collections.sort(studentAl);
		System.out.println("Asc" + studentAl);
//		Collections.sort(studentAl, new AscendingStudentComparator());
		studentAl.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator" + studentAl);
	}

}
