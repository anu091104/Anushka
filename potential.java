import java.util.Scanner;
import java.util.StringTokenizer;
public class potential
{
    public static int calP(String wd)    //to calculate the potential of a word
    {
        int sum=0;
        for(int i=0;i<wd.length();i++)
        {
           char ch=wd.charAt(i);
           sum=sum+(int)ch;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("INPUT:");
        String s=obj.nextLine();
        int len=s.length();
        char ch3=s.charAt(len-1);
        if(ch3=='.' || ch3=='?' || ch3=='!')
        {
          StringTokenizer st=new StringTokenizer(s," .?!");
          int count=st.countTokens();
          String word[]=new String[count];
          int potential[]=new int[count];
          for(int i=0;i<count;i++)
          {
              String w=st.nextToken();
              word[i]=w;
              potential[i]=calP(w);
              System.out.println(word[i]+"="+potential[i]);
          }
          //sorting the word on the ascending order of their acsii codes
          int n=count;
          for(int i=0;i<n-1;i++)
          {
              for(int j=0;j<n-i-1;j++)
              {
                  if(potential[j]>potential[j+1])
                  {
                      String t=word[j];
                      word[j]=word[j+1];
                      word[j+1]=t;
                      
                      int y=potential[j];
                      potential[j]=potential[j+1];
                      potential[j+1]=y;
                  }
              }
          }
          for(int i=0;i<n;i++)
          {
              System.out.print(word[i]+" ");
          }
        }
        else
        {
           System.out.println("INVALID INPUT");
            System.exit(0); 
        }
    }
}