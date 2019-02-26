package strava;

import java.util.ArrayList;
import java.util.List;

import interview.Service;

public class Strava extends Service {
	private static String[] routes = {"SRT", "CVT", "Perkiomen"};

	public Strava() {
		super("Strava", routes);
	}

	public List<String> getRoutesForUser(String userId ){
		List<String> userRoutes = new ArrayList<String>();
		
		for( String route : getRoutes() ) {
			userRoutes.add(userId+route);
		}
		return userRoutes;
	}
}
