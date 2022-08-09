import java.util.*;
public class saddlepoint
{
    int A[][],N;
    public saddlepoint(int x)
    {
        N=x;
    }
    public void accept()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Input the value of element:");
        //N=obj.nextInt();
        A=new int[N][N];
        for(int i=0;i<N;i++)
        {
          for(int j=0;j<N;j++)
          {
             A[i][j]=obj.nextInt();
          }
        }
    }
    public void print()
    {
        System.out.println("Entered Matrix ");
         for(int i=0;i<N;i++)
        {
          for(int j=0;j<N;j++)
          {
             System.out.print(A[i][j]+"\t");
          }
          System.out.println();
        }
    }
    int minrow(int x)
    {
        int i,min=999,pos=-1;
        for(i=0;i<N;i++)
        {
            if(A[x][i]<min)
            {
                min=A[x][i];
                pos=i;
            }
        }
        return pos;
    }
    int maxcolumn(int y)
    {
        int j,max=0,pos=-1;
        for( j=0;j<N;j++)
        {
           if(A[y][j]>max)
           {
              max=A[j][y];
              pos=j;
           }
        }
        return pos;
    }
    public void display()
    {
        int pos1=-1,pos2=-1;
        for(int k=0;k<N;k++)
        {
           pos1=minrow(k);
           pos2=maxcolumn(pos1);
           if(k==pos2)
           {
             System.out.println("Saddle point ");
             break;
            }
            else 
            {
                System.out.println("No Saddle point ");
                break;
            }
        }
    }
    void sort()
    {
        int i,j,t;
        for(i=0;i< N;i++)
        {
            for(j=0;j<N-1;j++)
            {
                if(A[j][j]>A[j+1][j+1])
                {
                    t=A[j][j];
                    A[j][j]=A[j+1][j+1];
                    A[j+1][j+1]=t;
                }
            }
        }
    }
    public static void main(String args[])
    {
        saddlepoint obj=new saddlepoint(3);
        obj.accept();
        System.out.println("Entered Matrix :\n");
        obj.print();
        obj.display();
        obj.sort();
        System.out.println("\nMatrix after sorting ");
        obj.print();
    }
}
    