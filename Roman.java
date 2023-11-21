import java.util.*;
class Roman{
public static void main(String ar[])
{
int i;
int res=0 , cur=0 , pre=0;
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a ROMAN number: ");  
String str= sc.nextLine();      
for(i=str.length()-1;i>=0;i--)
{
switch(str.charAt(i))
{
case 'I':
	cur=1;
	break;
case 'V':
	cur=5;
	break;
case 'X':
	cur=10;
	break;
case 'L':
	cur=50;
	break;
case 'C':
	cur=100;
	break;
case 'D':
	cur=500;
	break;
case 'M':
	cur=1000;
	break;
}
if(cur<pre){
res=res-cur;
}
else{
res=res+cur;
}
pre=cur;
}
System.out.println("integer="+res);
}
}
