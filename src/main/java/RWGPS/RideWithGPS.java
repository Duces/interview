package RWGPS;

import interview.Service;

public class RideWithGPS extends Service {

	private static String[] routes = {"CVT", "Perkiomen", "Welsh Mountain"}; 
	
	public RideWithGPS(String userId ) {
		
		super("RWGPS", routes, () -> userId + "%s");
	}

};