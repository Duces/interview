package interview;

public class Komoot extends Service {

	private static String[] routes = {"SRT", "Welsh Mountain", "Oaks to Philly"};

	public Komoot() {
		super("Komoot", routes, (String userId, String route) -> userId + route + userId);
	}

}
