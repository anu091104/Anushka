import java.util.*;
public class date
{
    int dd,mm,yy;
    public void serialtodate(int x,int y)
    {
        int i;
        int arr[]={31,28,31,30,30,31,31,31,31,30,31};
        for(i=0;x>arr[i];i++)
        {
            if(i==1 && y%4==0)
            {
                x-=29;
            }
            else
            {
                x-=arr[i];
            }
        }
        dd=x;
        mm=i+1;
        yy=y;
    }
    void display()
    {
        System.out.println(dd+"/"+mm+"/"+yy);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        date ob1=new date();
        date ob2=new date();
        int dn,n,y;
        System.out.println("Enter day number");
        dn=sc.nextInt();
        System.out.println("Enter year ");
        y=sc.nextInt();
        System.out.println("Enter date after n ");
        n=sc.nextInt();
        ob1.serialtodate(dn,y);
        ob2.serialtodate(dn+n,y);
        ob1.display();
        ob2.display();
    }
}