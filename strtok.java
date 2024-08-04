import java.util.StringTokenizer;
class str_tok
{
public static void main(String[]args)
{
StringTokenizer st=new StringTokenizer("Demonstrating methos from StringTokenizer class is was that those given them","");
while(st.hasMoreTokens())
{
System.out.println(st.nextElement());
}
}
}
