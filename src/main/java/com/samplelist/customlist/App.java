package com.samplelist.customlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		CustomList<Student> customStudentList = new CustomList<>();
		Student student = new Student(1, "Rahat", "CS");
		Student student1 = new Student(2, "Jubayer", "CS");
		Student student2 = new Student(3, "Benjir", "EEE");

		customStudentList.add(student);
		customStudentList.add(student1);
		customStudentList.add(student2);

		for (int i = 0; i < customStudentList.customListSize() - 1; i++) {

			System.out.print(customStudentList.getIndexOf(i).getId() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getName() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getDepartment());
			System.out.println();

		}

		List<Student> studentList = new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);

		customStudentList.concateAnotherList(studentList);
		
		System.out.println();
		System.out.println("New Print");
		System.out.println();

		for (int i = 0; i < customStudentList.customListSize() - 1; i++) {

			System.out.print(customStudentList.getIndexOf(i).getId() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getName() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getDepartment());
			System.out.println();

		}
		
		customStudentList.remove();
		
		System.out.println();
		System.out.println("New Print after removing");
		System.out.println();

		for (int i = 0; i < customStudentList.customListSize() - 1; i++) {

			System.out.print(customStudentList.getIndexOf(i).getId() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getName() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getDepartment());
			System.out.println();

		}
		
		customStudentList.removeIndexOf(3);
		
		System.out.println();
		System.out.println("New Print after specific item removing");
		System.out.println();

		for (int i = 0; i < customStudentList.customListSize() - 1; i++) {

			System.out.print(customStudentList.getIndexOf(i).getId() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getName() + "   ");
			System.out.print(customStudentList.getIndexOf(i).getDepartment());
			System.out.println();

		}

	}
}
