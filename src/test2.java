
public class test2 {
	public static void main(String args[]) {
String s="java is a prgramming language";
String[] s1=s.split("\s");
//for(String ch:s1)
//{
//	System.out.println(ch);
//}
for(int i=s1.length-1;i>=0;i--)
{
	System.out.println(s1[i]);
}
}
}
