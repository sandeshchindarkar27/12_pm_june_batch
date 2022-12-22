package apiautomation1.apiautomation1;


public class arithmatic 
{ public int sum (int a,int b)
  {
  int c;
  c=a+b;
  System.out.println("sum result is"+c);
  return c;
  }	  
  
  public int sub (int x,int y)
  {
	  
  int z;
  z=x-y;
  System.out.println("sub result is"+z);
  return z;
  }
  public int multi(int p,int q)
  {
  int r;
  r=p*q;
  System.out.println("mul result is"+r);
  return r;
  }
  public void div (int x1,int x2)
  {
		  int x3;
		  x3=x1/x2;
		  System.out.println("div result is"+x3);
		  
  }

public static void main(String[] args) 

{
	arithmatic obj=new arithmatic();
	int sumresult=obj.sum(10, 2);
	int sumresult1=obj.sum(sumresult, 2);
	int subresult=obj.sub(sumresult1, 2);
	int mulresult=obj.multi(subresult, 2);
	obj.div(mulresult, 2);
	
}	
} 
