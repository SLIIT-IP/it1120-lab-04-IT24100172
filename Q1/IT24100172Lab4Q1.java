import java.util.Scanner;
	public class IT24100172Lab4Q1{
        public static void main(String[] args){
  
	float number;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
        number=sc.nextFloat();

	if(number>0)
	 {System.out.print("The number is: positive");}	
	else if(number<0)
	  {System.out.print("The number is:Negative");}
	else
	  {System.out.print("The number is zero");}
 }
}
