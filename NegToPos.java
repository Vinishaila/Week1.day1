package week1.day1;

public class NegToPos {

	public static void main(String[] args) {
		int number=-40;
		int Value=Math.abs(number);
		
		if(number>=0)
		{
			System.out.println("Given Number is positive");   
			
		}
		
		else {System.out.println("Number is Negative"); 
		
		System.out.println("Positive number for the given number is :"+Value);
		
		}
	}

}
