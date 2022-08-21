import java.util.*;
public class word
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String wr[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELEVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN"
            ,"SEVENTEEN","EIGHTEEN","NINETEEN"};
          String wr1[]={"","","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
          int num,d1=0,d2=0,d3=0;
          System.out.println("INPUT:");
          num=obj.nextInt();
        if(num>=1000)
        {
            System.out.println("OUTPUT:"+"OUT OF RANGE");
        }
        else
        {
            d1=num/100;
            d2=(num/10)%10;
            d3=num%10;
            if(d1>0)
            {
               System.out.println("OUTPUT:"+" "+wr[d1]+" HUNDRED ");
            }
        }
        if(d2>=2)
        {
          System.out.print(wr1[d2]+" "+wr[d3]);
        }
        else
        System.out.println(wr[d2*10+d3]);
    }
}