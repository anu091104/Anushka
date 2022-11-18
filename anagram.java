import java.util.*;
public class anagram
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Input the word:");
        String wrd=obj.nextLine();
        int len=wrd.length();
        switch(len)
        {
            case 2: char ch1,ch2; 
                for(int i=0;i<len;i++)
            {
                for(int j=0;j<len;j++)
                {
                    if(i!=j)
                    {
                        ch1=wrd.charAt(i);
                        ch2=wrd.charAt(j);
                        System.out.println(" "+ch1+ch2);
                    }
                }
            }
            break;
            case 3: char ch3,ch4,ch5;
            for(int i=0;i<len;i++)
            {
                 for(int j=0;j<len;j++)
                 {
                     for(int k=0;k<len;k++)
                     {
                         if(i!=j && i!=k && j!=k)
                         {
                             ch3=wrd.charAt(i);
                             ch4=wrd.charAt(j);
                             ch5=wrd.charAt(k);
                             System.out.println(" "+ch3+ch4+ch5);
                         }
                     }
                 }
            }
            break;
            case 4: char a,b,c,d;
            for(int i=0;i<len;i++)
            {
                 for(int j=0;j<len;j++)
                 {
                     for(int k=0;k<len;k++)
                     {
                         if(i!=j && i!=k && j!=k)
                         {
                             int x=6-(i+j+k);
                             a=wrd.charAt(i);
                             b=wrd.charAt(j);
                             c=wrd.charAt(k);
                             d=wrd.charAt(x);
                             System.out.println(" "+a+b+c+d);
                        }
                    }
                }
            }
            break;
    }
}
}
