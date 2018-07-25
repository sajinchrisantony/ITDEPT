import java.util.*;
class Rectangle
{
int length;int breadth;

Rectangle(int l,int b)
{
length=l;
breadth=b;
}
}
class RectangleHeight extends Rectangle
{
int height;
RectangleHeight(int l,int b,int h)
{
super(l,b);
height=h;
}
void volume()
{
int v;
v=length*breadth*height;
System.out.println("Volume="+v);
}
}
public class one
{
public static void main(String args[])
{int l,b,h;
Scanner d=new Scanner(System.in);
System.out.println("Enter length,breadth,height");
l=d.nextInt();
b=d.nextInt();
h=d.nextInt();
RectangleHeight r1=new RectangleHeight(l,b,h);
r1.volume();
}
}