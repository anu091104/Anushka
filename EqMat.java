import java.util.*;
public class EqMat
{
    int a[][];
    int m,n;
    public EqMat(int mm,int nn)
    {
        m=mm;
        n=nn;
        a=new int[mm][nn];
    }
    public void readarray()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("INPUT");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               a[i][j]=obj.nextInt();
            }
        }
    }
    public int check(EqMat P,EqMat Q)
    {
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(P.a[i][j]==Q.a[i][j])
               {
                   c++;
               }
            }
        }
        if(c==(m*n))
        return 1;
         else
        return 0;
     }
        public void print()
        {
          for(int i=0;i<m;i++)
          {
              for(int j=0;j<n;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              
           
           System.out.println();
        }
        }
        public static void main(String args[])
        {
            EqMat P=new EqMat(3,3);
            EqMat Q=new EqMat(3,3);
            P.readarray();
            Q.readarray();
            P.print();
            Q.print();
            if(P.check(P,Q)==1)
            {
                System.out.println("EQUAL MATRIX");
            }
            else
            {
                System.out.println("UNEQUAL MATRIX");
            }
        }
        }
    

