public class Assignment5{
	public static void main(String[] args)
	{
		boolean returnValue = checkStudentName("Rathna");
		System.out.println(returnValue);
		String returnValue1 = prime(4);
		System.out.println(returnValue1);
		String returnValue2 = even(5);
		System.out.println(returnValue2);
		char returnValue3 = gender("male");
		System.out.println(returnValue3);
		boolean returnValue4 = phoneNumber(9481553968l);
		System.out.println(returnValue4);
		float returnValue5 = gravity(7.8f , 5.6f);
		System.out.println(returnValue5);
		double returnValue6 = velocity(23.45678d , -087.45678d);
		System.out.println(returnValue6);
		int returnValue7 = division(2 , 8);
		System.out.println(returnValue7);
		char returnValue8 = result(8.9f);
		System.out.println(returnValue8);
		int returnValue9 = average(10 , 20, 30);
		System.out.println(returnValue9);
	}
	
	public static boolean checkStudentName(String name)
	{
		if(name.length() >= 5)
		{
			System.out.println("name is valid");
			return true;
		}
		else
		{
			System.out.println("name not valid");
			return false;
		}
	}
	
	public static String prime(int number)
	{
		if(number%2 == 0)
		{
			System.out.println("number is a prime");
			return "prime number";
		}
		else{
			System.out.println("not a prime number");
			return "not prime";
		}
	}
	
	public  static String even(int num)
	{
		if(num%2 ==0)
		{
			System.out.println("num is even");
			return "even";
		}
		else
		{
			System.out.println("num is odd");
			return "odd";
		}
	}
	
	public static char gender(String g)
	{
		if(g == "female")
		{
			System.out.println("gender is female");
			return 'f';
		}
		else
		{
			System.out.println("gender is male");
			return 'm';
		}
	}
	
	public static boolean phoneNumber(long phNo)
	{
		if(phNo >=10)
		{
			System.out.println("phone number is valid");
			return true;
		}
		else{
			System.out.println("not a valid phone number");
			return false;
		}
	}
	public static float gravity(float g1 , float g2)
	{
		if(g1 >=6.5)
		{
			System.out.println("gravity is high");
			return g1;
		}
		else{
			System.out.println("gravity is low");
			return g2;
		}
	}
	
	public static double velocity(double d1 , double d2)
	{
		if(d1 > 0 )
		{
			System.out.println("velocity is greater than zero");
			return d1;
		}
		else 
		{
			System.out.println("velocity is lesser than zero");
		    return d2;
		}
	}
	public static int division(int c , int d)
	{
		int e = c/d;
		if(e>0)
		{
			System.out.println("division is valid");
			return e;
		}
		else
		{
			System.out.println("division is not valid");
			return 0;
		}
	}
	
	public static char result(float cgpa)
	{
		if(cgpa >=6.5f)
		{
			System.out.println("pass");
			return 'p';
		}
		else 
		{
			System.out.println("fail");
			return 'f';
		}
	}
	public static int average(int x , int y , int z)
	{
		int avg = (x + y + z)/3;
		if(avg > 0)
		{
			System.out.println("numbers are greater");
			return avg;
		}
		else
		{
			System.out.println("numbers are not valid");
			return 0;
		}
	}
	
		
			
	
}

		