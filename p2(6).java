import java.util.*;
public class Main
{
public static void main(String arg[])
	{
	long n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
	   
            n=sc.nextLong();
                
            int i=1;
                
               do
               {
                  fact=fact*i;
                     i++;
               }
 	       while(i<=n);
                  
	  
 
  	    System.out.println("fact="+fact);
 
	}
 
}