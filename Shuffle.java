import java.util.*;
class Shuffle{

public static void main(String arg[])
{
int ar[]={1,2,3,4,5,6,7,8,9};
shuffle(ar);

}
static void shuffle(int ar1[])
{
    int i,temp;
for(i=0;i<ar1.length-1;i=i+2)
{
    temp=ar1[i];
    ar1[i]=ar1[i+1];
    ar1[i+1]=temp;
}
for(i=0;i<ar1.length;i++)
{
    System.out.println(ar1[i]);
}
}
}
