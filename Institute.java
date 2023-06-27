public class Institute{
	public static void main(String[] args)
	{
		add(10,20);//executing with int,int values.
		add(10,20,30);//executing with int,int,int values.
		add(10,(byte)15);//executing with int,long values.
		add(10,(short)20);//executing with int,short values.
		add(20 , 5.6f);//executing with int,float values.
		add(6.7f , 30);//executing with short,int values.
		getDetails("Rathna");//executing with string values.
		getDetails("Rathna","tiptur");//executing with string,string values.
		getDetails("anju" , 56);//executing with string,int values.
		getDetails("pavan" , (byte)32);//executing with string,byte values.
		getDetails("shamatha" , 87.6f,80);//executing with string,float,int values.
		getDetails(90, 65.7f , "rathna");//executing with int,float,string values.
		getName(45);//executing with int values.
		getName(40 , 34);//executing with int,int values.
		getName(30 , (short)45);//executing with int,short values.
		getName(56 , "Rathna");//executing with int,string values.
		getName(43 , (byte)56);//executing with int,byte values.\
		getName((byte)32,56);//executing with byte,int values.
		
	}
	public static int add(int value1,int value2)
	{
		int value3 = value1 + value2;
		System.out.println("addition successful");
		return value3;
	}
	public static int add(int value1 , int value2 , int value3)
	{
		int value4 = value1 +value2 +value3;
		System.out.println("addition successful2");
		return value4;
	}
	public static int add(int value1 , byte value2)
	{
		int value3 = value1 + value2;
		System.out.println("addition successful3");
		return value3;
	}
	public static int add(int value1 , short value2)
	{
		int value3 = value1 + value2;
		System.out.println("addition successful4");
		return value3;
	}
	public static float add(int value1, float value2)
	{
		float value3 = value1 + value2;
		System.out.println("addition successful5");
		return value3;
	}
	public static float add(float value1,int value2)
	{
		float value3 = value1 + value2;
		System.out.println("addition successful5");
		return value3;
	}
	public static void getDetails(String name)
	{
		System.out.println("details valid");
	}
	public static void getDetails(String name,String place )
	{
		System.out.println("details not valid");
	}
	public static void getDetails(String name , int id)
	{
		System.out.println("details true");
	}
	public static void getDetails(String name , byte id)
	{
		System.out.println("details true1");
	}
	public static void getDetails(String value1 , float value2 ,int value3)
	{
		System.out.println("details correctly valid");
	}
	public static void getDetails(int value1 , float value2 , String value3)
	{
		System.out.println("details correctly valid1");
	}
	public static String getName(int id )
	{
		String name = "rathna";
		System.out.println("Name valid");
		return name;
	}
	public static String getName(int id , int usn)
	{
		String name = "rathna";
		System.out.println("Name valid1");
		return name;
	}
	public static String getName(int id , short usn)
	{
		String name = "rathna";
		System.out.println("Name valid2");
		return name;
	}
	public static String getName(int id , String usn)
	{
		String name = "rathna";
		System.out.println("Name valid3");
		return name;
	}
	public static String getName(int id , byte usn)
	{
		String name = "rathna";
		System.out.println("Name valid4");
		return name;
	}
	public static String getName(byte id , int usn)
	{
		String name = "rathna";
		System.out.println("Name valid5");
		return name;
	}
	
		
	
	
	

}