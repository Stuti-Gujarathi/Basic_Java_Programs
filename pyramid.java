class pyramid 
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=3;i++)
{
for(j=1; j<=5; j++)
{
if((j>=4-i) && (j<=2+i))
{
System.out.printf("*");
}
else
{
System.out.printf(" ");
}
}
System.out.println(" ");
}
}
}