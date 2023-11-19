package cs141.jlhenry2;

public class Vehicle implements Engine{
	public int gear;
	public int speed = 0;
	//this creates variables yayyyyyyyyyyyyyyyyyyyyyy
	
	public Vehicle(int newSpeed, int newGear) {
		gear = newGear;
		speed = newSpeed;
		print();
	} // This is our constructor
	
	public void changeGear(int a) {
		gear = a;
	}//this changes the gear
	
	public void speedUp(int a) {
		speed += a;
	}//this sets the speed 
	
	public void print() {
		System.out.println("Vehicle [speed=" + speed + ", gear=" + gear + "]");
	}//this is our print method 

}
