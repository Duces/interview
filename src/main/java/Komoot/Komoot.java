package Komoot;

import java.util.ArrayList;
import java.util.List;

import interview.Service;

public class Komoot extends Service {

	private static String[] routes = {"SRT", "Welsh Mountain", "Oaks to Philly"};

	public Komoot() {
		super("Komoot", routes);
	}

	public List<String> getRoutesForUser(String userId ){

		List<String> userRoutes = new ArrayList<String>();
		
		for( String route : getRoutes() ) {
			userRoutes.add(userId+route+userId);
		}
		return userRoutes;
	}
}
