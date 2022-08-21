import java.util.*;
public class Specialfun
{
    int n;
    Specialfun()
    {
        n=0;
    }
    Specialfun(int x)
    {
        n=x;
    }
    public void sum()
    {
        int rev=0,temp,sum=0,d,ld,fd;
        temp=n;
        fd=temp%10;
        while(temp!=0)
        {
          d=temp%10;
          rev=rev*10+d;
          temp/=10;
        }
        ld=rev%10;
        sum=fd+ld;
        System.out.println("Sum of the first and last digit:"+" "+sum);
    }
    public void isSpecial()
    {
       int temp2=n,fact=1,d2,sum=0;
       while(temp2!=0)
       {
          d2=temp2%10;
          fact=1;
          for(int i=1;i<=d2;i++)
          fact*=i;
          sum=sum+fact;
          temp2/=10;
       }
       if(sum==n)
       {
          System.out.println(" "+n+" "+"is a Special Number");
       }
       else
       System.out.println(" "+n+" "+"Is not a Special Number");
    }
    public static void main(String args[])
    {
        Specialfun ob=new Specialfun();
        ob.sum();
        ob.isSpecial();
    }
}