package Example2;

public class Main {

	public static void main(String[] args) {
		
		LandVehicle motorcycle = new LandVehicle();
		String type = "";
		motorcycle.Brand = "Yamaha";
		motorcycle.Colour = "Silver";
		motorcycle.Model = "YZ450F";
		System.out.println("The vehicle is motorcycle.");
		System.out.println("The brand of the motorcycle is " + motorcycle.Brand);
		System.out.println("The colour of the motorcycle is " + motorcycle.Colour);
		System.out.println("The model of the motorcycle is " + motorcycle.Model);
		motorcycle.disTravel();
		motorcycle.sport(type);
		motorcycle.cruising();

		LandVehicle car = new LandVehicle();
		String type2 = "";
		car.Brand = "Toyota";
		car.Colour = "White";
		car.Model = "Vios";
		System.out.println("The brand of the car is " + car.Brand);
		System.out.println("The colour of the car is " + car.Colour);
		System.out.println("The model of the car is " + car.Model);
		car.disTravel2();
		car.sport2(type2);
		car.cruising2();
	}

}
