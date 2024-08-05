package SDET_Java_Programs;

public class PasswordMatching {
	public static void main(String args[]) {
		String[] passwords= {
				 "Password123!",
		            "password",
		            "PASSWORD123",
		            "Password",
		            "Passw0rd!",
		            "P@ssw0rd",
		            "Abcdef1!"
		};
		for(String password:passwords)
		{
			System.out.println(password+" "+"valid:"+isvalidPassword(password));
		}
	}

	private static boolean isvalidPassword(String password) {
		if((password.length()<8)||password.length()>20)
		{
			return false;
		}
		if(!password.matches(".*[A-Z].*"))
		{
			return false;
		}
		if(!password.matches(".*[a-z].*"))
		{
			return false;
		}
		if(!password.matches(".*\\d.*"))
		{
			return false;
		}
		if(!password.matches(".*[!@#$%^&*()].*"))
		{
			return false;
		}
		
		return true;
	}

}
