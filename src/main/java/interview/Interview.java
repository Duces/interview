package interview;

import java.util.Arrays;

import Komoot.Komoot;
import RWGPS.RideWithGPS;
import strava.Strava;

public class Interview {

	public static void main(String[] args) {
		String userId = "42";
		Service[] allServices = {new RideWithGPS("42"), new Strava("42"), new Komoot("42")};
		
		Services services = new Services( Arrays.asList(allServices));

		System.out.println("All Routes: " + services.getRoutes());
		System.out.println("Unquie Routes: " + services.getUniqueRoutes());
		System.out.println("For User " + userId + ":" + services.getRoutesForUser(userId));

		Service[] usersServices = {new RideWithGPS("42"), new Strava("42")};
		services = new Services( Arrays.asList(usersServices));
		System.out.println("For User " + userId + " services " + services.getServiceNames() + ":" + services.getRoutesForUser(userId));
	}

}
