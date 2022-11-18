import java.util.*;
public class pandc
{
   int n,r;       
   public void accept()
   {
     Scanner obj=new Scanner(System.in);
     System.out.println("Input the value of n:");
     n=obj.nextInt();   
     System.out.println("Input the value of r:");
     r=obj.nextInt();
    }
   public int factorial(int a)
   {
       int i,f=1;
       for(i=1;i<=a;i++)
       {
          f*=i;
       }
       return f;
   }
   public void display()
   {
       int p,c;
       p=factorial(n)/factorial(n-r);
       c=factorial(n)/((factorial(n-r)*factorial(r)));
       System.out.println("P is="+p);
       System.out.println("C is="+c);
   }
   public static void main(String args[])
   {
       pandc ob=new pandc();
       ob.accept();
       ob.display();
    }
}
