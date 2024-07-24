public class StringBuff
{
public static void main(String[] args)
{
 StringBuffer sb = new StringBuffer("Hello");
 sb.append(" World");
 System.out.println("After append(String): " + sb);
 sb.append('!');
 System.out.println("After append(char): " + sb);
 sb.append(123);
 System.out.println("After append(int): " + sb);
 sb.insert(5, ","); 
 System.out.println("After insert(String): " + sb);
 sb.insert(0, 'A'); 
 System.out.println("After insert(char): " + sb);
 sb.insert(2, 789);
 System.out.println("After insert(int): " + sb);
 sb.replace(5, 10, "");
 System.out.println("After replace: " + sb);
 sb.delete(5, 9);
 System.out.println("After delete: " + sb);
 sb.deleteCharAt(0);
 System.out.println("After deleteCharAt: " + sb);
 sb.reverse();
 System.out.println("After reverse: " + sb);
 char[] dst = new char[10];
 sb.getChars(0, 5, dst, 0);
 System.out.print("After getChars: ");
 for (char c : dst) 
 System.out.print(c); 
 System.out.println();
 int capacity = sb.capacity();
 System.out.println("Current capacity: " + capacity);
 sb.setLength(5);
 System.out.println("After setLength(5): " + sb);
 char ch = sb.charAt(0);
 System.out.println("Character at position 0: " + ch);
 String sub = sb.substring(1, 3);
 System.out.println("Substring from position 1 to 3: " + 
sub);
 int length = sb.length();
 System.out.println("Length of the buffer: " + length);
 }
 
}
