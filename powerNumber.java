import java.util.*;
public class powerNumber {
      public static void main(String  X[])
	{
	Scanner viv = new Scanner(System.in);
	System.out.println("Enter the base");
	int b=viv.nextInt();

	System.out.println("Enter the Index");
	int no=viv.nextInt();

	
	int p=1,i=1;
	while(i<=no){
	p=p*b;
	i++;
	}

      System.out.println("Power is:"+p);
	
     }
}