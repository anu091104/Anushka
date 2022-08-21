import java.util.*;
public class ReversiblePrime
{
    int N;
    public void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Input the number to be checked");
        N=obj.nextInt();
        System.out.println("ORIGNAL NUMBER:"+N);
    }
    public int prime(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
               c++;
            }
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    public int reverse(int y)
    {
        int temp,d,rev=0;
        temp=y;
        while(temp!=0)
        {
           d=temp%10;
           rev=rev*10+d;
           temp=temp/10;
        }
        return rev;
    }
    public void display()
    {
        int r=reverse(N);
        if(prime(N)==1 && prime(r)==1 && (N%10==3 || N%10==9 || r%10==3 || r%10==9))
        {
            System.out.println("REVRESIBLEPRIME NUMBER:"+r);
        }
        else
        {
            System.out.println("not ReversiblePrime Number"+r);
        }
    }
    public static void main(String args[])
    {
        ReversiblePrime ob=new ReversiblePrime();
        ob.input();
        ob.display();
    }
}
        