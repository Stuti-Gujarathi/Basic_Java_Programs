public class StringBuffDemo
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("Java");
System.out.println("The String Buffer is:" +str);
System.out.println("The length is:" +str.length());
System.out.println("The capacity is:" +str.capacity());
str.reverse();
System.out.println("The reverse is:" +str);
str.replace(2,8, "jpr");
System.out.println("The replace value is:"+str);
}
}