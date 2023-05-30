

class FandangoYacht extends Boat{
	
	//Declare the methods.
	void mainSailcolor () {
		System.out.println("The color is present. It is beige.");
	}
	
	void Float() {
		System.out.println("We are floating.");
	
	}
	
	@Override
	void STOP() {
		System.out.println("'No, ayoko mag-stop.");
		super.STOP();
	}
}