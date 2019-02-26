package interview;

import java.util.Arrays;

import Komoot.Komoot;
import RWGPS.RideWithGPS;
import strava.Strava;

public class Interview {

	public static void main(String[] args) {
		String userId = "42";
		Service[] allServices = {new RideWithGPS(), new Strava(), new Komoot()};
		
		Services services = new Services( Arrays.asList(allServices));

		System.out.println("All Routes: " + services.getRoutes());
		System.out.println("Unquie Routes: " + services.getUniqueRoutes());
		System.out.println("For User " + userId + ":" + services.getRoutesForUser(userId));

		Service[] usersServices = {new RideWithGPS(), new Strava()};
		System.out.println("For User " + userId + " services:" + services.getRoutesForUser(Arrays.asList(usersServices), userId));
		System.out.println(usersServices);
	}

}
