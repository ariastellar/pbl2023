import java.util.*;
 class StringDemo
 {
 public static void main(String args[])
 { 
 String s1= new String();
 String s2= new String("welcome");
 char chars[] = { 'a', 'b', 'c', 'd' }; 
 String s3 = new String(chars);
 System.out.println(s3);
 
 char chars1[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's' }; 
 String s4 = new String(chars1, 0,4); 
 System.out.println(s4); 
 byte b[] = { 97, 98, 99, 100 }; 
 String s5 = new String(b); 
 System.out.println(s5);
 
 
 byte b1[] = { 65, 66, 67, 68, 69, 70 }; 
 String s6 = new String(b1, 2, 4); 
 System.out.println(s6); 
 }
}
