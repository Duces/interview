package interview;

import interview.Service;

public class Komoot extends Service {

	private static String[] routes = {"SRT", "Welsh Mountain", "Oaks to Philly"};

	public Komoot(String userId) {
		super("Komoot", routes, () -> userId + "%s" + userId);
	}

}
