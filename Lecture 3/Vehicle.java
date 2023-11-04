package vehicle;

class Car {
	private String type;
	private int seats;
	private String fuel;
	private String color;
	//without parameters
	Car() {
		type = "";
		seats = 0;
		fuel = "";
		color = "";
	}
	//with parameters
	Car (String type, int seats, String fuel, String color){
		this.type = type;
		this.seats = seats;
		this.fuel = fuel;
		this.color = color;
	}
	
	//setters
	public void setType(String type)
	{this.type = type;}
	
	public void setSeats(int seats)
	{this.seats = seats;}
	
	public void setFuel(String fuel)
	{this.fuel = fuel;}
	
	public void setColor(String color)
	{this.color = color;}
	
	//getters
	public String getType()
	{return type;}
	
	public int getSeats()
	{return seats;}
	
	public String getFuel()
	{return fuel;}
	
	public String getColor()
	{return color;}


	public void spec() {
	System.out.println("Car Type - " + type);
	System.out.println("Car Seats - " + seats);
	System.out.println("Car Fuel - " + fuel);
	System.out.println("Car Color - " + color);
	}
}

public class Vehicle {
	public static void main(String[] args) {
		Car fav_car = new Car("Sport", 5, "Diesel", "Lime");
		Car sec_car = new Car();
		
		//showing fav car
		System.out.println("Favorite Car:");
		System.out.println("Type - " + fav_car.getType());
		System.out.println("Seats - " + fav_car.getSeats());
		System.out.println("Fuel - " + fav_car.getFuel());
		System.out.println("Color - " + fav_car.getColor());
		
		sec_car.setType("SUV");
		sec_car.setSeats(4);
		sec_car.setFuel("Gas");
		sec_car.setColor("Blue");
		System.out.println();
		System.out.println("Second Car:");
		
		//using spec(), shows all details
		sec_car.spec();
		
		//compare seats
		System.out.println();
		if(fav_car.getSeats() > sec_car.getSeats())
		{
			System.out.println("Favorite Car has more seats ("+fav_car.getSeats()+")");
		}
		else
			System.out.println("Second Car has more seats ("+sec_car.getSeats()+")");
	}
}
