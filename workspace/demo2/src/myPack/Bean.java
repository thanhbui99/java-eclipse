package myPack;
import java.util.*;
public class Bean {
 public static List<Users> ExportUser(){
	 List<Users> list = new ArrayList<Users>();
	 list.add(new Users("Thanh","developer"));
	 list.add(new Users("Ngan","Tester"));
	  return list;
 }
}
