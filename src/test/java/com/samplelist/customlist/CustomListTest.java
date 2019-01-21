package com.samplelist.customlist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class CustomListTest {
	
	List<Student> studentList = new ArrayList<Student>();
	CustomList<Student> studentCustomList;
	Student student;
	
	
	
//	@Before
//	
//	private void before() {
//		// TODO Auto-generated method stub
//		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
//	}

	@Test
	public void testAdd() {
		
		studentCustomList = new CustomList<Student>().add(new Student(1, "Rahat", "CS"));
		student = new Student(1, "Rahat", "CS");
		for(int i = 0; i < studentCustomList.customListSize()-1;i++) {
			assertEquals(student.getId(), studentCustomList.getIndexOf(i).getId());
			assertEquals(student.getName(), studentCustomList.getIndexOf(i).getName());
			assertEquals(student.getDepartment(), studentCustomList.getIndexOf(i).getDepartment());
		}
	}

	@Test
	public void testRemove() {
		
		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
		studentCustomList = new CustomList<Student>().replaceWithList(studentList);
		studentCustomList.remove();
		for(int i = 0; i < studentCustomList.customListSize()-1;i++) {
			assertNotEquals(new Student(3, "Riad", "CS").getId(), studentCustomList.getIndexOf(i).getId());
		}
		
	}

	@Test
	public void testRemoveIndexOf() {
		
		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
		studentCustomList = new CustomList<Student>().replaceWithList(studentList);
		studentCustomList.removeIndexOf(1);
		for(int i = 0; i < studentCustomList.customListSize()-1;i++) {
			System.out.println(studentCustomList.getIndexOf(i).getId());
		}
		for(int i = 0; i < studentCustomList.customListSize()-1;i++) {
			assertNotEquals(new Student(2, "Aniruddha", "EEE").getId(), studentCustomList.getIndexOf(i).getId());
		}
	}

	@Test
	public void testGetIndexOf() {
		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
		studentCustomList = new CustomList<Student>().replaceWithList(studentList);
		assertEquals(new Student(2, "Aniruddha", "EEE").getId(), studentCustomList.getIndexOf(1).getId());
		assertEquals(new Student(2, "Aniruddha", "EEE").getName(), studentCustomList.getIndexOf(1).getName());
		assertEquals(new Student(2, "Aniruddha", "EEE").getDepartment(), studentCustomList.getIndexOf(1).getDepartment());
	}

	@Test
	public void testConcateAnotherList() {
		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
		studentCustomList = new CustomList<Student>(new Student(1, "Rahat", "CS")).concateAnotherList(studentList);
		int index = 1;
		for(Student student:studentList) {
			assertEquals(student.getId(), studentCustomList.getIndexOf(index).getId());
			assertEquals(student.getName(), studentCustomList.getIndexOf(index).getName());
			assertEquals(student.getDepartment(), studentCustomList.getIndexOf(index).getDepartment());
			index++;
		}
	}

	@Test
	public void testCustomListSize() {
		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
		studentCustomList = new CustomList<Student>().replaceWithList(studentList);
		assertEquals(3, studentCustomList.customListSize());
	}
	
	@Test
	public void testReplaceWithList() {
		studentList = Arrays.asList(new Student(1, "Rahat", "CS"),new Student(2, "Aniruddha", "EEE"),new Student(3, "Riad", "CS"));
		studentCustomList = new CustomList<Student>(new Student(1, "Rahat", "CS"));
		studentCustomList = studentCustomList.replaceWithList(studentList);
		int index = 0;
		
		for(Student student:studentList) {
			assertEquals(student.getId(), studentCustomList.getIndexOf(index).getId());
			assertEquals(student.getName(), studentCustomList.getIndexOf(index).getName());
			assertEquals(student.getDepartment(), studentCustomList.getIndexOf(index).getDepartment());
			index++;
		}
		assertEquals(studentList.size(), studentCustomList.customListSize());
	}
	

}
