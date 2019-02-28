package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Service {

	private List<String> routes;
	protected String name;
	private UserIdStrategy idStrategy;

	public Service( String name, String[] routes, UserIdStrategy idStrategy) {
		this.routes = Arrays.asList(routes);
		this.name = name;
		this.idStrategy = idStrategy;
	}

	public List<String> getRoutes() {
		return routes;
	}

	public String getName() {
		return name;
	}

	public List<String> getRoutesForUser( String userId ) {

		List<String> userRoutes = new ArrayList<String>();
		
		for( String route : getRoutes() ) {
			userRoutes.add(idStrategy.augmentWithUserId(userId, route));
		}
		return userRoutes;
	}
	
	@Override
	public String toString() {
		return routes.toString();
	}

}
