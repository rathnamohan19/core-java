public class Impotant{
	public static void main(String[] args)
	{   //String using literals
		String name = "rathna";
		String address = "bhadrapura";
		String mothername = "Shamantha kumari B G";
		String carName = "Maruthi Swift";
		String collegeName = "Kalpataru Institute Of Technology";
		String fatherName = "Mohan kumar B C ";
		String course = "Full Stack Development";
		String touristSpot = "Dharmasthala Manjuntha Swamy";
		String favFood = "Masala Dosa ";
		String email = "rathnarani868@gmail.com";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(mothername);
		System.out.println(carName);
		System.out.println(collegeName);
		System.out.println(fatherName);
		System.out.println(course);
		System.out.println(touristSpot);
		System.out.println(favFood);
		System.out.println(email);
		
		//String using new keyword
		String color = new String("blue");
		String password = new String("rathnaMOHAN@19");
		String stream = new String("  Computer Science   ");
		String graduation = new String("BE");
		String result = new String("Distinction");
		String review = new String("best");
		String outStandingStudent = new String("Pavan B M");
		String topper = new String("Anju B M");
		String favPlace = new String("Home Sweet Home");
		String assignmentTopic = new String("Strings and its Methods");
		
		System.out.println(color);
		System.out.println(password);
		System.out.println(stream);
		System.out.println(graduation);
		System.out.println(result);
		System.out.println(review);
		System.out.println(outStandingStudent);
		System.out.println(topper);
		System.out.println(favPlace);
		System.out.println(assignmentTopic);
		
		
		//String and its inbuilt methods , Strings are class and Strings are immutable
		int result1 = name.compareTo("rathna");//compares two strings and returns 0 if both are equal
		System.out.println(result1);
		
		
		boolean result2 = mothername.endsWith("i");//compares suffix and returns true or false.
		System.out.println(result2);
		
		int result3 = fatherName.lastIndexOf("");//it gives the lasr index of that string.
		System.out.println(result3);
		
		String result4 = carName.replace('a' , 'g');//used to replace particular character by another character in the string.
		System.out.println(result4);
		
		String result5 = favPlace.toLowerCase();//it returns lower case of the string.
		System.out.println(result5);
		
		String result6 = color.toUpperCase();//it returns lower case of the string.
		System.out.println(result6);
		
		String result7 = stream.trim();//returns string by removing spaces at beginning and end.
		System.out.println(result7);
		
		
		String value = review.concat("good");//concat is used to join two strings.
		System.out.println(value);
		
		boolean result8 = assignmentTopic.equals("Strings and Methods");//equals is used to compare two strings and return boolean value.
		System.out.println(result8);
		
		int result9 = favFood.indexOf(2);//it will give index.
		System.out.println(result9);
		
		boolean result10 = address.isEmpty();//isEmpty returns true if string is empty else false.
		System.out.println(result10);
		
		int result11 = mothername.length();//length() returns length of string.
		System.out.println(result11);
		
		String[] result12 = touristSpot.split(" ");//split will split the words where space is there.
		for(int i=0 ; i<result12.length; i++)
		{
			
		System.out.println(result12[i]);
		}

		char returnedvalue = name.charAt(2);
		System.out.println(returnedvalue);
		
					
	}
}

		