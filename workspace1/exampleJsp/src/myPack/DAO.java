package myPack;

import java.util.*;

public class DAO {
	public static List<Users> exportUser() {
		List<Users> list = new ArrayList<Users>();
		list.add(new Users("thanh", "developer"));
		list.add(new Users("bui", "tester"));
		return list;
	}
}
