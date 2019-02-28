package interview;

public class Strava extends Service {
	private static String[] routes = {"SRT", "CVT", "Perkiomen"};

	public Strava() {
		super("Strava", routes, (String userId) -> "%s" + userId);
	}
}
