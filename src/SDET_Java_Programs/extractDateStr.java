package SDET_Java_Programs;

public class extractDateStr {

	public static void main(String[] args) {
		  String inputStr = "iyuuuuuuuuuu2022jhh2022-10-22ghghh";
		  int firstDateIndex = inputStr.indexOf("2022-10-22");
	        int secondDateIndex = inputStr.indexOf("2022-10-22", firstDateIndex + 1);
	        if (firstDateIndex != -1 && secondDateIndex != -1 && firstDateIndex < secondDateIndex) {
	            System.out.println(inputStr.substring(secondDateIndex,secondDateIndex+10)); 
	        }	        	        	
	}

}
