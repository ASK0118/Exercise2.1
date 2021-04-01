package Example2;

public class LandVehicle {
	String Brand = "";
	String Colour = "";
	String Model = "";

	void disTravel() {
		System.out.println("I ride motorcycle for distance travelling");
	}

	void sport(String type) {
		type = "freestyle motocross, land speed, and hill climbs";
		System.out.println("The sport event for motorcycle are " + type);
	}

	void cruising() {

		System.out.println("I also ride motorcycle for cruising around\n");
	}
	
	void disTravel2() {
		System.out.println("I drive car for distance travelling");
	}

	void sport2(String type) {
		type = "One-make racing, Sports car racing, and Time Attack Series";
		System.out.println("The sport event for motorcycle are " + type);
	}

	void cruising2() {
		System.out.println("I also drive car to cruise around");
	}
}
