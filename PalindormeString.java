import java.util.*;
public class PalindormeString
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int len,i,j;
        String st,wrd="",rev;
        char ch,ch2,ch3;
        System.out.println("Input the sentence:");
        st=obj.nextLine().toUpperCase();
        len=st.length();
        ch=st.charAt(len-1);
        if(ch=='.' || ch== '!' ||ch== '?')
        {
           for(i=0;i<len;i++)
           {
              ch2=st.charAt(i);
              if(ch2!=' '&& ch2!='.'&& ch2!='!'&& ch2!='?')
              {
                  wrd+=ch2;
              }
              else
              {
                int len2=wrd.length();
                rev="";
                for(j=0;j<len2;j++)
                {
                   ch3=wrd.charAt(j);
                   rev=ch3+rev;
                }
                if(wrd.equals(rev))
                System.out.println(wrd+" ");
                else
                {
                    System.out.print(wrd+rev.substring(1,len2)+" ");
                }
                wrd="";
              }
            }
        }
    }
}