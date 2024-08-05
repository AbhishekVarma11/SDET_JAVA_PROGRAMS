import java.util.Scanner;

public class String_Split {
	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);

     System.out.print("Enter comma-separated values: ");
     String input = scanner.nextLine();
     String[] values=input.split(",");
     scanner.close();
     for(String i:values)
     {
    	 System.out.print(i+" ");
     }
     String input2=input.trim().replaceAll(" ","");
     String[] values2=input2.split(",");
     for(String i:values2)
     {
    	 System.out.print(i);
     }
     System.out.println();
     String joined=String.join("",values2);
     System.out.println(joined);
    
     
}
}
