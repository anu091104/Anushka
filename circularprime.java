/*A Circular Prime is a prime number that remains prime under cyclic shifts of its digits.
When the leftmost digit is removed and replaced at the end of the remaining string of digits, 
the generated number is still prime. The process is repeated until the original number is reached again. 
A number is said to be prime if it has only two factors 1 and itself. 
Example:
 131 311 113 Hence, 131 is a circular prime.
Accept a positive number N and check whether it is a circular*/
import java.util.*;
public class circularprime
{
    int num;
    public void accept()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("INPUT:");
        num=obj.nextInt();
    }
    public int isprime(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if(count==2)
            return 1;
            else
            return 0;
    }
    public int rotate(int y)
    {
        String x=""+y;
        String s1=x.substring(1)+x.substring(0,1);
        return Integer.parseInt(s1);
    }
    void check()
    {
        int len=(""+num).length();int c=0;
        for(int i=0;i<len;i++)
        {
            System.out.println(num);
            if(isprime(num)==1)
            {
                c++;
            }
            num=rotate(num);
        }
        if(c==len)
        {
            System.out.println("Circular Prime no "+num);
        }
        else
        {
            System.out.println("Not a circular prime no "+num);
        }
    }
    public static void main(String args[])
    {
        circularprime ob=new circularprime();
        ob.accept();
        ob.check();
    }
}
    

