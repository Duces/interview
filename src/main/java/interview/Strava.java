package interview;

import interview.Service;

public class Strava extends Service {
	private static String[] routes = {"SRT", "CVT", "Perkiomen"};

	public Strava(String userId) {
		super("Strava", routes, () -> "%s" + userId);
	}
}
