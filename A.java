package lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class main {

public static void main(String[] args) {
try
{
BufferedReader ifile = new BufferedReader(new FileReader("brackets.in"));
PrintWriter ofile = new PrintWriter(new BufferedWriter(new FileWriter("brackets.out")));
boolean[] stack=new boolean[10000];//dafasdf
while (true)
{
boolean f=true;
int head=-1;
String s=ifile.readLine();//fasdfadfa
if (s==null||s=="")
{
break;
}
for (int i=0;i<s.length()&&f;i++)
{
switch (s.charAt(i))
{
case '(':
head++;
stack[head]=true;
break;
case '[':
head++;
stack[head]=false;
break;
case ')':
if (head>=0&&stack[head])
{
head--; 
}
else
{
f=false;
}
break;
case ']':
if (head>=0&&!stack[head])
{
head--; 
}
else
{
f=false;
}
break;
}
}
if (f&&head==-1)
{
ofile.println("YES");
}
else
{
ofile.println("NO");//fsaf
}
}
ofile.flush();//dfasdfasdf
ifile.close();
ofile.close();
}
catch(IOException e1) {
e1.printStackTrace();
}
}

}
