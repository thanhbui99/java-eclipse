package DAO;

public class LoginDAO {
   public static boolean Validate(String name,String pass){
	   boolean t = false;
	   if(name.equals("admin") && pass.equals("123")){
		   t= true;
	   }
	   return t;
   }
} 
