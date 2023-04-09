package Numberprogramm;
import java.util.*;
public class Numgives implements  Numbuilder{
	public void largestnumber(){
		 Scanner s=new Scanner(System.in);
		 System.out.println("ENTER THE A VALUE:");
			int a=s.nextInt();
			System.out.println("ENTER THE B VALUE:");
	        int b=s.nextInt();
				if (a>b)
				{
				System.out.println("THE LARGEST VALUE IS \"A\"");
				}
				else 
					{
						System.out.println("THE LARGEST VALUE  IS \"B\"");
					}
	 }
	   public void largestnumbers3() {
		   Scanner s=new Scanner(System.in);
		   System.out.println(" ENTER THE VALUE OF A ");
		     int a=s.nextInt();
		  System.out.println(" ENTER THE VALUE OF B ");
			 int b=s.nextInt();
		   System.out.println(" ENTER THE VALUE OF C ");
			 int c=s.nextInt();

		  if ((a>b  && a>c))
		  {
			  System.out.println("THE LARGEST NUMBER IS \"A\":"+a);
		  }
	      else if ((b>a && b>c) )
			{
				System.out.println(" THE LARGEST NUMBER IS \"B\":"+b);
			}
	      else 
			{
				System.out.println("THE LARGEST NUMBER IS\"C\":"+c);
			}

	   }
	    public void secondlargest() {
	    	 Scanner s=new Scanner(System.in);
	    	 System.out.println(" ENTER THE VALUE OF A ");
		     int a=s.nextInt();
		  System.out.println(" ENTER THE VALUE OF B ");
			 int b=s.nextInt();
		   System.out.println(" ENTER THE VALUE OF C ");
			 int c=s.nextInt();

		  if ((a>b  && a<c) || (a<b && a>c))
		  {
			  System.out.println("THE SECOND LARGEST NUMBER IS \"A\":"+a);
		  }
	      else if ((b>a && b<c) || (b<a && b>c))
			{
				System.out.println(" THE SECOND LARGEST NUMBER IS \"B\":"+b);
			}
	      else 
			{
				System.out.println("THE SECOND LARGEST NUMBER IS\"C\":"+c);
			}

	    }
	   public void sumvalues() {
         Scanner s=new Scanner(System.in);
			System.out.println("ENTER THE VALUE:");
			int n=s.nextInt();
			int sum=0;
			int last=0;
			for (int a=n;a>0;sum+=last )
			{  last=a%10;
				a/=10;
			
			}
			System.out.println("THE SUM OF GIVEN VALUE IS:" +sum);   
	   }
	    public void countnumbers() {
	    	 Scanner s=new Scanner(System.in);
	    	System.out.println(" PLEASE ENTER THE VALUE.....");
			int num=s.nextInt();//1234
			int count=0;
			do
			{ num/=10;//123..12..1..0
			  ++count;//414-12-2022
			}
			while (num>0);//123..12..1
			{
				System.out.println("number of digits:"+count);
			}
	    }

	   public void strongnumber() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE VALUES");
			int num=s.nextInt();
			int sum=0;
			int last=0;
		    int temp=num;
			int fact=1;
			while (num>0)
			{
			 last=num%10;
			for (int i=1;i<=last ;i++ )
			{ 
			  fact=fact*i;
			}
			 sum=sum+fact;
			  fact=1;
			  num/=10;
			}
			  if (temp==sum)
			  {
				  System.out.println("THE GIVEN NUMBER IS:"+temp+ "\"STRONG NUMBER\"");
			  }
			  else 
			{
				System.out.println("THE GIVEN NUMBER IS:"+temp+ "\"NOT A STRONG NUMBER\"");
			}
	   }
	   public void palindrome() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE VALUE:");
			int num=s.nextInt();
			int rev=0;
			int temp=num;
			while (num>0)
			{
				rev=rev*10+(num%10);
				num/=10;
			}
			if (temp==rev)
			{
				System.out.println("THE GIVEN NUMBER IS:"+rev+"\"PALINNDROME\"");
			}
			else 
			{
				System.out.println("THE GIVEN NUMBER IS:"+rev+"\" NOT PALINNDROME\"");
			}
	   }
	   public void armstrongnumber() {

		   
			System.out.println("\"ENTER THE NUMBER\"");
			 Scanner s=new Scanner (System.in);
			int num=s.nextInt();
			int count=0;
			int temp=num;
			int last=0;
			int product=1;
			int sum=0;
			while(num>0)
			{
				num/=10;
				count++;
			}
			//System.out.println("THE GIVEN NUMBER COUNT IS:"+count);
			num=temp;
			while(num>0)
			{
				last=num%10;
			
			for (int i=1;i<=count ;i++ )
			{
				product=product*last;
			}
				sum=sum+product;
				product=1;
				num=num/10;
			 
			}

			if (sum==temp)
			{
				System.out.println("THE GIVEN NUMBER IS\"ARMSTRONG");
			}
				else
			{
	           System.out.println("THE GIVEN NUMBER IS\" NOT ARMSTRONG\"");
			}
	   }
	   public void febonacy() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE A VALUE");
			int n1=s.nextInt();
			System.out.println("ENTER THE B VALUE");
			int n2=s.nextInt();
			int n3=0;
			System.out.println(n1+" "+n2);
			for (int i=3;i<=10;i++ )//3.4.5
			{
				n3=n1+n2;//1+10..10+11
				System.out.println(n3+" ");//11.21
				n1=n2;//10.11
				n2=n3;//11..21
			}
	   }
	   public void primenumber() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE VALUE");
			int num=s.nextInt();
			int count=0;
			for (int i=1;i<=num ;i++ )
			{
				if (num%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println("THE GIVEN "+num+" is:\"PRIME NUMBER\"");
			}
			else
				{ 
				System.out.println("THE GIVEN "+num+" is:\"NOT PRIME\"");
			}
	   }
	   public void factors() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE NUMBER");
			int num=s.nextInt();
			for (int i=1;i<num ;i++ )
			{
				if (num%i==0)
				{
					System.out.println("FACTORS OF "+num+" IS:"+i);
				}
			}
	   }
	   public void factorial() {
		   Scanner s=new Scanner(System.in);

			System.out.println("ENTER THE VALUE");
			int num=s.nextInt();
			long fact=1l;
	       for (int i=1;i<=num ;i++ )
	       { 
			   fact=fact*i;
	       }
		   System.out.println("THE GIVEN NUMBER "+num+" FACTORIAL VALUES  IS:"+fact);
	   }
	   public void xylem() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE VALUE");
			int num=s.nextInt();
			int last=num%10;
			num/=10;
			int sum=0;
			while (num>9)
			{
				sum=sum+(num%10);
				num/=10;
			}
			int first_last=num+last;
			if (first_last==sum)
			{
				System.out.println("THE GIVEN NUMBER IS XYLEM");
			}
				else
				{
					System.out.println("THE GIVEN NUMBER IS NOT XYLEM");
				}
	   }
	   public void perfectnumbers() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE VALUE");
			int num=s.nextInt();
			 int sum=0;
			 for (int i=1;i<num ; i++)
			 {
				 if (num%i==0)
				 {
					 sum+=i;
				 }
			 }
			 if (num==sum)
			 {
				 System.out.println("THE GIVEN NUMBER IS "+num+":\" PERFECT\"");
			 }
			 else 
				 {
				 System.out.println("THE GIVEN NUMBER IS "+num+":\"NOT PERFECT\"");
			 }
	   }
	   public void primenumberinrange() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("ENTER THE START VALUE:");
			int num=s.nextInt();
			System.out.println("ENTER THE END VALUE:");
			int end=s.nextInt();

			for (int i=num;i<end ;i++ )
			{ int count=0;
			  for (int j=1;j<=i ;j++ )
			  { 
				  if (i%j==0)
				  {
					  count++;
				  }
			  }
			
			if (count==2)
			{
				System.out.println("THE GIVEN NUMBER "+i+" IS \"PRIME\"");
			}
			else {
				System.out.println("THE GIVEN NUMBER "+i+" IS \"NOT PRIME\"");}
	       
			}
	   }
}










