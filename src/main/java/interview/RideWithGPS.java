package interview;

public class RideWithGPS extends Service {

	private static String[] routes = {"CVT", "Perkiomen", "Welsh Mountain"}; 
	
	public RideWithGPS() {

		super("RWGPS", routes, (String userId, String route) -> userId + route );
	}

};