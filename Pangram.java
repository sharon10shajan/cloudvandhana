import java.util.*;
class Pangram{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sentence");
String str=sc.nextLine();
System.out.println(str);
String ex="abcdefghijklmnopqrstuvwxyz";
for(int i=0;i<ex.length();i++){
if(str.indexOf(ex.charAt(i))==-1)
{
System.out.println("it is not pangram");
System.exit(0);
}
}
System.out.println("it is pangram");    
}
}