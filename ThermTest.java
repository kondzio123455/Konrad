
public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
        Thermometer thermB = new Thermometer(10.0);
        double tempB = thermB.getCelsius();
        System.out.println("Temp. of Thermometer A is " + tempB );

		
	} // end main
} // end class ThermTest
