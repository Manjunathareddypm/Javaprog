class sumcmdln
{
public static void main (String[] args)
{
int n, count=0, sum=0;
System.out.println("first argument is: "+args[0]);
for(int i=0;i<args.length;i++)
{
try
{
n=Integer.parseInt(args[i]); 
sum= sum+n;
}
catch (NumberFormatException e)
{
//system.out.println("invalid integer:");
count++;
}
}
System.out.println("Sum of only valid integers is= "+sum) ;

System.out.println("Invalid integers are: "+count) ;
}
}
