import java.util.StringTokenizer;
class  mainS
{
public static void main(String[]args)
{
StringTokenizer st=new StringTokenizer("Demonstrating methos from StringTokenizer class is was that those given them","");
while(st.hasMoreElements())
{
System.out.println("Next token is:"+st.nextToken(","));
}
}
}
