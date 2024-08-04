class agilan20
 
{
public int roll;
public String name;
agilan20(int roll,String name)
{
this.roll=roll;
this.name=name;
}
 
public static void main(String[]args)
{
agilan20[]arr;
arr=new agilan20[5];
arr[0]=new agilan20(1,"A");
arr[1]=new agilan20(2,"b");
arr[2]=new agilan20(3,"c");
arr[3]=new agilan20(4,"d");
arr[4]=new agilan20(5,"e");
for (int i=0;i<arr.length;i++)
{
System.out.println(arr[i].roll+" "+arr[i].name);
}
}
}
