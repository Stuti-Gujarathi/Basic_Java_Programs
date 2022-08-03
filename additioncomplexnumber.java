class additioncomplexnumber
{
   int a, b,sum;
   additioncomplexnumber()
{
   a=0;
   b=0;
}
    additioncomplexnumber(int x,int y)
{
    a=x;
    b=y;
}
    public void add()
{
    sum=a+b;
}
    public void display()
{
    System.out.println("sum of"+a+ "&" +b+ "=" +sum);
}
    public static void main(String args[])
{
    additioncomplexnumber a=new additioncomplexnumber (40,50);
    a.add();
    a.display();
}
}