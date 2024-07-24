class StringMethods
{
public static void main(String args[])
{
String str = "JavaGuides";
char ch = str.charAt(3);
System.out.println(ch);
String subStr = str.substring(3);
System.out.println(subStr);
String subStr1 = str.substring(4, 10);
System.out.println(subStr1);
String s1="welcome"; 
String s2="welcome"; 
String s3="WELCOME"; 
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equalsIgnoreCase(s2));
String s4 = "wel" + "come";
System.out.println(s4);
}}
