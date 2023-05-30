
public class theMain {
	public static void main(String []args) {
		
		//Calling item LETTER C
		FandangoYacht newobjC = new FandangoYacht();
		
		newobjC.speed = "23 mph";
		newobjC.color = "Beige";
		newobjC.price = "$200,000";
		
			//Print the speed, color and price.
			System.out.println(newobjC.speed);
			System.out.println(newobjC.color);
			System.out.println(newobjC.price);
			
			//Call the methods.
			newobjC.mainSailcolor();
			newobjC.Float();
			newobjC.STOP();
		
		//Calling item LETTER B
		U2SpyPlane newobjB =  new U2SpyPlane();
		newobjB.speed = "300 mph";
		newobjB.color = "White";
		newobjB.price = "$1,200,000";
		
			//Print the speed, color and price.
			System.out.println(newobjB.speed);
			System.out.println(newobjB.color);
			System.out.println(newobjB.price);
			
			//Call the methods.
			newobjB.STOP();
			newobjB.wingsSpan();
			newobjB.fly();
		
		//Calling item LETTER A
		ToyotaVIOS newobjA = new ToyotaVIOS();
		newobjA.speed = "40 mph";
		newobjA.color = "Red";
		newobjA.price = "$100,000";
		
			//Print the speed, color and price.
			System.out.println(newobjA.speed);
			System.out.println(newobjA.color);
			System.out.println(newobjA.price);
			
			//Call the methods.
			newobjA.STOP();
			newobjA.tireType();
			newobjA.drive();
			
		
		
		
		
		
		
		
	}
} 
