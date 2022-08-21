import java.util.*;
public class matrix1
{
    int A[][],M;
    matrix1(int n)
    {
       M=n;
       A=new int[n][n];
       if(n<3&&n>10)
       {
           System.out.println("INVALID OUTPUT");
           System.exit(0);
        }
    }
    public void readmatrix()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("The Elements of the array are:");
        for(int i=0;i<M;i++)
        {
           for(int j=0;j<M;j++)
           {
              A[i][j]=obj.nextInt();
           }
        }
    }
    public void sort()
    {
        int arr[]=new int[M*M];
        int temp=0;
        int k=0;
        for(int i=1;i<M-1;i++)
        {
           for(int j=1;j<M-1;j++)
           {
               arr[k]=A[i][j];
               k++;
            }
        }
        for(int p=0;p<k;p++)
        {
           for(int q=0;q<k;q++)
           {
            if(arr[q]>arr[q+1])
            {
                temp=arr[q];
                arr[q]=arr[q+1];
                arr[q+1]=temp;
           }
        }
    }
        k=0;
        for(int i=1;i<M-1;i++)
        {
            for(int j=1;j<M-1;j++)
            {
                A[i][j]=arr[k];
                k++;
            }
        }
    }
public void sumdigonal()
    {
        int sum1=0,sum2=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
               if(i==j)
               {
               sum1+=A[i][j];
              }
               if((i+j)==(M-1))
               {
                  sum2+=A[i][j];
               }
            }
        }
        System.out.println("SUM OF THE FIRST DIAGONAL:"+sum1);
         System.out.println("SUM OF THE SECOND DIAGONAL:"+sum2);
    }
    public void Print()
    {
        System.out.println("DIAGONAL MATRIX");
        for(int i=0;i<M;i++)
        {
           for(int j=0;j<M;j++)
           {
              if(i==j||(i+j)==(M-1))
              {
                 System.out.print(A[i][j]+" ");
               }
               else
               System.out.print("\t");
            }
            System.out.println();
        }
    }

    public void print2()
    {
        System.out.println("ORIGNAL MATRIX");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
               System.out.print(A[i][j]+"\t");
            }
        
        System.out.println();
    }
}
    public static void main(String args[])
    {
        matrix1 ob=new matrix1(4);
        ob.readmatrix();
        ob.print2();
        ob.sort();
        
        ob.sumdigonal();
        ob.Print();
        ob.print2();
    }
}

