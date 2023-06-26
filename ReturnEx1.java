public class ReturnEx1{
	public static void main(String[] args){
		int returnValue = turnOn();
		System.out.println(returnValue);
		String returnValue2 = favFood();
		System.out.println(returnValue2);
		nothing();
		char returnValue3 = turnOff();
		System.out.println(returnValue3);
		float returnValue4 = cgpa();
		System.out.println(returnValue4);
		long returnValue5 = phoneNumber();
		System.out.println(returnValue5);
		double returnValue6 = gravity();
		System.out.println(returnValue6);
		byte returnValue7 = number();
		System.out.println(returnValue7);
		boolean returnValue8 =  isStudent();
		System.out.println(returnValue8);
		short returnValue9 = numberOfStudents();
		System.out.println(returnValue9);
		int[] returnValue10 = array();
		System.out.println(returnValue10);
		
		
		
	}
	public static int turnOn()
		{
			int a = 7;
			int b = 8;
			int c = a + b;
			return c;
		}
		
		public static String favFood()
		{
			String name1 = "rathna";
			String name2 = "mohan";
			String name3 = name1 + name2;
			return name3;
			
		}
		public static void nothing()
		{
			return ;
		}
		
		public static char turnOff()
		{
			char button = 'O';
			return button;
		}
		
		public static float cgpa()
		{
			float pass = 8.5f;
			float fail = 5.5f;
			if ( pass >= 8.5f)
			{
				return pass;
			}
			else
			{
				return fail;
			}
		}
		
		public static long phoneNumber()
		{
			long ph1 = 9481553968l;
			long ph2 = 8431186477l;
			long ph3 = 6366221639l;
			return ph1;
		}
		public static double gravity()
		{
			double g1 = 45.456789d;
			double g2 = 67.976534d;
			return g1;
		}
		
		public static byte number()
		{
			byte b =10;
			byte c = 20;
			byte h = 30;
			return c;
		}
		public static boolean isStudent()
		{
			boolean isStudent1 = true;
			boolean isStudent2= false;
			return isStudent1;
		}
		
		public static short numberOfStudents()
		{
			short a = 6;
			short c = 7;
			short d = c;
			return d;
		}
		
		
		
		
			
		
		
		
				
			
			
		
		
		
}

		
	
		
		
		
		
			

