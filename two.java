import java.util.*;
class media
{
String title;
int publication;
media(String title1,int pub)
{
title=title1;
publication=pub;
} 
}
class book extends media
{
int pages;
book(String t,int pub,int page)
{
//title=t;
//publication=pub;
super(t,pub);
pages=page;
}
void displayb()
{
System.out.println("Title="+title);
System.out.println("Publication="+publication);
System.out.println("Pages="+pages);
}
}
class tape extends media
{
int playingtime;
tape(String t,int pub,int pt)
{
//title=t;
//publication=pub;
super(t,pub);
playingtime=pt;
}
void displayt()
{
System.out.println("Title="+title);
System.out.println("Publication="+publication);
System.out.println("Playing Time="+playingtime);
}
}

public class two
{
public static void main(String args[])
{
int n;
Scanner d=new Scanner(System.in);
System.out.println("Enter 1 for book , 2 for Tape");
n=d.nextInt();
if(n==1)
{
String t1;
int p1,b1;
Scanner y=new Scanner(System.in);
System.out.println("Enter title,publication,book pages");
t1=y.nextLine();
p1=y.nextInt();
b1=y.nextInt();
book r1=new book(t1,p1,b1);
r1.displayb();
}
else
{
String t2;
int p2,p3;
Scanner y1=new Scanner(System.in);
System.out.println("Enter title,publication,tape playing time");
t2=y1.nextLine();
p2=y1.nextInt();
p3=y1.nextInt();
tape r2=new tape(t2,p2,p3);
r2.displayt();
}
}
}