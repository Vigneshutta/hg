import java.util.*;
import java.io.*;
public class Fibonacciseries{
  
  public static void main(String[] args)throws IOException
  {
    
    BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
    int i,n,t1=0,t2=1,temp;
    System.out.println("Enter the number of terms");
    n=Integer.parseInt(vc.readLine());
    System.out.println("Fibonacci series");
    for(i=1;i<=n;++i)
    {
     System.out.println(t1);
      temp=t1+t2;
      //temp=t1;
      t1=t2;
      t2=temp;
     
      }
      }
      }
      
