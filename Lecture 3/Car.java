package car;

public class Car {
	private String type;
	private int no_seats;
	private String fuel;
	private String body_color;
	
	// new code
	int get_seats(){
		return no_seats;
	}
	
	String get_fuel() {
		return fuel;
	}
	
	String get_color() {
		return body_color;
	}
	
	void set_seats(int s) {
		no_seats = s;
	}
	
	void set_fuel(String f) {
		fuel = f;
	}
	
	void set_color(String c) {
		body_color = c;
	}
	
	
	//new code end
	Car(){
	type="";
	no_seats=0;
	fuel="";
	body_color="";
	}
	Car (String type, int seats, String fuel, String body_color){
	this.type=type;
	this.no_seats=seats;
	this.fuel=fuel;
	this.body_color=body_color;
	}
	public String getType(){
	return type;
	}
	public void setType(String type){
	this.type=type;
	}


	public class Vehicle{
		
	}
}
