import java.util.*;
public class Transarray
{
    int arr[][],m,n;
    
    public Transarray()
    {
        arr=new int[m][n];
       
    }
    public Transarray(int nn,int mm)
    {
        m=mm;
        n=nn;
        if(m>20 || n>20)
        {
            System.out.println("OUT OF RANGE:");
            System.exit(0);
        }
         arr=new int[m][n];
        
    }
    public void fillarray()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("INPUT THE ELEMENTS OF THE ARRAY:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               arr[i][j]=obj.nextInt();
            }
        }
    }
    public void transpose(Transarray A)
    {
        for(int i=0;i<A.m;i++)
        {
           for(int j=0;j<A.n;j++)
           {
             arr[j][i]=A.arr[i][j];
           }
        }
        m=A.n;
        n=A.m;
    }
    public void display()
    {
        
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
              System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }
    }
    public static void main(String args[])
    {
        Transarray ob1=new Transarray(3,4);
        Transarray ob2=new Transarray(4,3);
        ob1.fillarray();
        ob2.transpose(ob1);
        System.out.println("ORIGNAL MATRIX");
        ob1.display();
        System.out.println("TRANSPOSED MATRIX");
        ob2.display();
    }
}

        