import java.util.*;
public class arm
{
    long n,num;
    boolean isArmstrong(long x)
    {
        long g=x;
        long sum=0;
        while(g!=0)
        {
         long d=g%10;
         sum=sum+d*d*d;
         g=g/10;
        }
        if(sum==x)
        return true;
        else 
        return false;
    }
    boolean isArmstronglike(long y)
    {
        long f=y;
        long sum2=0;
        while(f!=0)
        {
           long d2=f%100;
           sum2=sum2+d2*d2*d2;
           f=f/100;
        }
        if(sum2==y)
        return true;
        else
        return false;
    }
    public void genArmstrongNos()
    {
        System.out.println("The armstrong numbers are:");
        for(long i=100;i<999;i++)
        {
            if(isArmstrong(i)==true)
            {
               System.out.println(i);
            }
        }
    }
    public void genArmstrongLikeNos()
    {
        System.out.println("The armstrong numbers are:");
        for(long j=100000;j<=999999;j++)
        {
           if(isArmstronglike(j)==true)
           {
               System.out.println(j);
           }
        }
    }
    public static void main(String args[])
    {
        arm ob=new arm();
        ob.genArmstrongNos();
        ob.genArmstrongLikeNos();
    }
}