import java.util.*;
public class prg6
{
    public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in);
      System.out.println("INPUT: N=");
      int N=obj.nextInt();
      obj.nextLine();
      if(N<=2 || N>=9)
      {
         System.out.println("INVALID INPUT");
         System.exit(0);
      }
      String team[]=new String[N];
      int longest=0;
      System.out.println("Enter the names:");
      for(int i=0;i<N;i++)
      {
          System.out.println("Team "+(i+1)+":");
          team[i]=obj.nextLine();
      }
      for(int i=0;i<N;i++)
        { 
          if(team[i].length()>longest)
          longest = team[i].length();
        }
        System.out.println("OUTPUT:");
        for(int x=0;x<longest;x++)
        {
            for(int y=0;y<N;y++)
            { int l = team[y].length();
                if(x>=l)
                System.out.print(" \t");
                else
                System.out.print(team[y].charAt(x)+"\t");
            }
            System.out.println();
        }
    }
}