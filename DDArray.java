import java.util.*;
public class DDArray
{
    int mat[][];
    int m;
    public DDArray(int n)
{
    m=n;
    mat=new int[m][m];
}
public void readmatrix()
{
    Scanner obj=new Scanner(System.in);
    System.out.println("INPUT");
    for(int i=0;i<m;i++)
    {
       for(int j=0;j<m;j++)
       {
           mat[i][j]=obj.nextInt();
       }
    }
}
public void display()
{
    System.out.println("ORIGNAL MATRIX");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
       {
           System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}
public void Sums()
{
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(i==j)
            {
               sum1+=mat[i][j];
            }
         if((i+j)==m-1)
        {
            sum2+=mat[i][j];
        }
        if(i==0 || j==0 || i==(m-1) || j==(m-1))
        {
            sum3+=mat[i][j];
        }
    }
}
System.out.println("Sum of first diagonal="+sum1);
System.out.println("Sum of second diagonal="+sum2);
System.out.println("Sum of the outer boundary elements="+sum3);
}
public void Show_Mats()
{
    System.out.println("INNER MATRIX");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(i!=0 && j!=0 && i!=(m-1) && j!=(m-1))
            {
                System.out.print(mat[i][j]+" ");
            }
         }
         System.out.println();
      }
}
public static void main(String args[])
{
    DDArray ob=new DDArray(4);
    ob.readmatrix();
    ob.display();
    ob.Show_Mats();
    ob.Sums();
}
}

 