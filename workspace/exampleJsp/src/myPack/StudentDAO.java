package myPack;

import java.util.*;

public class StudentDAO {
	public static List<Student> exportStudent() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("thanh", 2));
		list.add(new Student("bui", 3));
		list.add(new Student("ngoc", 4));
		list.add(new Student("lan", 5));
		list.add(new Student("anh", 6));
		list.add(new Student("thi", 7));
		return list;
	}
}
