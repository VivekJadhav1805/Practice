import java.util.*;
public class ReverseNum{
public static void main(String X[])
{
Scanner viv = new Scanner(System.in);
int no,rev=0,rem;
System.out.println("Enter the Reverse Number");
no=viv.nextInt();

while(no!=0)
   {
    rem = no%10;
    rev = rev*10+rem;
    no=no/10;

   }

System.out.println("Reverse is:"+rev);


}

}