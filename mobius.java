import java.util.*;
public class mobius
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Input a number");
        int n=obj.nextInt();
        int i,a,b,p=2,c=0,x=0,m=1;
        int t=n;
        while(t>1)
        {
           if(t%p==0)
           {
              System.out.print(p+"x");
               c++;
              t/=p;
              x++;
              if(x>1)
              {
                 m=0;
                 
                }
            }
            else
            {
                p++;
                x=0;
            }
        }
        if(m==0)
        {
            System.out.println("\nDuplicate Prime Factors ");
            System.out.println(0);
        }
        else if(c==0)
        {
            System.out.println("No Prime Factors ");
        }
        else
        {
            System.out.println("\n Number of Distinct Prime Factors "+c);
            System.out.println(Math.pow(-1,c));
        }
    }
}
