public class Methods{
	public static void main(String[] args){
		studentsCount();
		details();
		vowels();
		phone();
		student();
		
		{
			public static void studentsCount(){
				
			int[] numberOfStudents = {10 , 20 , 30 , 40 , 50};
			for(int i =0;i <= numberOfStudents.length-1;i++)
			{
				System.out.println(numberOfStudents[i]);
			}
		}
			
		
		public static void studentsCount(){
			int[] numberOfStudents = {10 , 20 , 30 , 40 , 50};
			for(int i =0;i <= numberOfStudents.length-1;i++)
			{
				System.out.println(numberOfStudents[i]);
			}
		}
		
		public static void details(){
			char[] gender = {'f' , 'm' ,'f' , 'm' , 'm'};
			for(int i=0 ; i<=gender.length-1;i++)
			{
				System.out.println(gender[i]);
			}
		}
		public static void vowels(){
			char[] vowelsInAlphabets = {'a' , 'e' , 'i' , 'o' ,'u'};
			for(int i = 0;i<=vowelsInAlphabets.length-1;i++)
			{
				System.out.println(vowelsInAlphabets[i]);
			}
		}
		public static void phone(){
			long[] phoneNumber = new long[5];
			phoneNumber[0] = 4567890987l;
			phoneNumber[1] = 9481553968l;
			phoneNumber[2] = 8431186477l;
			phoneNumber[3] = 6366221639l;
			phoneNumber[4] = 9164127402l;
			for(int i = 0;i<=phoneNumber.length-1;i++)
			{
				System.out.println(phoneNumber[i]);
			}
		}
		
		public static void student(){
			boolean[] isStudent = new boolean[5];
			isStudent[0] = true;
			isStudent[1] = false;
			isStudent[2] = true;
			isStudent[3] = false;
			isStudent[4] = true;
			for(int i=0;i<=isStudent.length-1;i++)
			{
				System.out.println(isStudent[i]);
			}
		}
		}
	}
}
		
	

				