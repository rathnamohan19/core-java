public class Car{
	String brand;
	int price;
	int speed;
	String owner;
	String color;
	int noOfSeats;
	int noOfGears;
	int noOfAirBags;
	String sideBrand;
	int noOfTyres;
	int size;
	String fuel;
	int petrolConsumption;
	int noOfWindows;
	int noOfClutch;
	int sound;
	int carInsuranceDuration;
	String loanBankName;
	int fuelCapacity;
	boolean isOpenTop;
	

	
	public Car(String brand , int price , String fuel , int fuelCapacity)
		{
			this.brand = brand;
			this.price = price;
			this.fuel = fuel;
			this.fuelCapacity = fuelCapacity;
		}
		
		public static void openAirBag()
		{
		}
		
		public static void openDoor()
		{
		}
		
		public static void getMusic()
		{
		}
		
		public static void onAC()
		{
		}
		
		public static void changegear()
		{
		}
		
		public static void openWindows()
		{
		}
		
		public static void lockCar()
		{
		}
		
		public static void openLock()
		{
		}
		
		public static void onCar()
		{
		}
		
		public static void offCar()
		{
		}
		
		public static void main(String[] args)
		{
			Car car = new Car("Maruthi" , 1100000 , "Diesel" , 50);
			System.out.println(car);
			System.out.println(car.brand);
			System.out.println(car.price);
			System.out.println(car.fuel);
			System.out.println(car.fuelCapacity);
		}
	
}

		
	



			
		
	
	
	
		
		
		


