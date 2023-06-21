public class Methods3{
	public static void main(String[] args){
		studentCount();
		phone();
		vowels();
		cgpa();
		booleanMethod();

	}
	
	public static void studentCount()
	{
		int[] numberOfStudents = { 10, 20 , 30 , 40 , 50};
		for(int i=0;i<=numberOfStudents.length-1;i++)
		{
			System.out.println(numberOfStudents[i]);
		}
		
	}
	
	public static void phone()
	{
		long[] phoneNumber = new long[5];
		phoneNumber[0] = 9481553968l;
		phoneNumber[1] = 8431186477l;
		phoneNumber[2] = 6366221639l;
		phoneNumber[3] = 9164127402l;
		phoneNumber[4] = 345678876l;
		for(int i = 0; i<=phoneNumber.length-1;i++)
		{
			System.out.println(phoneNumber[i]);
		}
	}
	public static void vowels()
	{
		char[] vowelsInAlphabets = new char[5];
		{
			vowelsInAlphabets[0] = 'a';
			vowelsInAlphabets[1] = 'e';
			vowelsInAlphabets[2] = 'i';
			vowelsInAlphabets[3] = 'o';
			vowelsInAlphabets[4] = 'u';
			for(int i = 0;i<=vowelsInAlphabets.length-1;i++)
			{
				System.out.println(vowelsInAlphabets[i]);
			}
		}
	}
	
	public static void cgpa()
	{
		float[] cgpaOfStudents = new float[5];
		{
			cgpaOfStudents[0] = 8.2f;
			cgpaOfStudents[1] = 9.4f;
			cgpaOfStudents[2] = 5.6f;
			cgpaOfStudents[3] = 7.4f;
			cgpaOfStudents[4] = 7.9f;
			for(int i = 0;i<=cgpaOfStudents.length-1;i++)
			{
				System.out.println(cgpaOfStudents[i]);
			}
		}
	}
	
	public static void booleanMethod()
	{
		boolean[] isStudent = {true , false , true , true , false};
		for(int i =0; i<=isStudent.length-1;i++)
		{
			System.out.println(isStudent[i]);
		}
	}
	
	
	
			
	
}
	
					
					
			
		
		
		