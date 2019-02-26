package RWGPS;

import java.util.ArrayList;
import java.util.List;

import interview.Service;

public class RideWithGPS extends Service {

	private static String[] routes = {"CVT", "Perkiomen", "Welsh Mountain"}; 

	public RideWithGPS() {
		super("RWGPS", routes);
	}

	public List<String> getRoutesForUser(String userId ){

		List<String> userRoutes = new ArrayList<String>();
		
		for( String route : getRoutes() ) {
			userRoutes.add(route+userId);
		}
		return userRoutes;
	}

};