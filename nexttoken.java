import java.util.StringTokenizer;
class nxt
{
public static void main(String[]args)
{
StringTokenizer st=new StringTokenizer("Demonstrating methos from String Tokenizer class is was that those given them","");
while(st.hasMoreTokens())
{
System.out.println("Next token is:"+st.nextToken(","));
}
}
}
