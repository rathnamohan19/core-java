public class Chair{
	int numberOfStudents;
	String name;
	int marks;
	float cgpa;
	char gender;
	
	public Chair()
	{
		System.out.println("default constructor");
		System.out.println(numberOfStudents);
		System.out.println(marks);
		System.out.println(name);
		
	}
	
	
	public Chair(int numberOfStudents1 , String name1 , int marks1, float cgpa1,char gender1)
	{
		System.out.println("parametrised constructor");
		numberOfStudents = numberOfStudents1;
		name = name1;
		marks = marks1;
		cgpa = cgpa1;
		gender = gender1;
		
	}
	
	public static void main(String[] args)
	{
		new Chair();
		System.out.println("**********************");
		Chair chair = new Chair(10 , "rathna" , 50 , 8.2f , 'f');
		System.out.println(chair.numberOfStudents);
		System.out.println(chair.name);
		System.out.println(chair.marks);
		System.out.println(chair.cgpa);
		System.out.println(chair.gender);
	}
}

		