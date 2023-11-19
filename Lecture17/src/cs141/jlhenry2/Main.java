package cs141.jlhenry2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//This makes it so we can get user input
		
		Vehicle coolCar = new Vehicle(70, 3);
		//This will call the Vehicle class
		
		System.out.println("Please tell me how much you would like to speed up by:");
		int speed = scnr.nextInt();
		coolCar.speedUp(speed);
		//this'll get the speed and put it in coolcar
		
		System.out.println("Please tell what you would like your new gear to be:");
		int gear = scnr.nextInt();
		coolCar.changeGear(gear);
		//this'll get the gear and put it in coolcar
		
		System.out.println("-----------------------------------------------------");
		
		coolCar.print();
		//this prints coolcar

	}

}
