package interview;

import java.util.Arrays;
import java.util.List;

public abstract class Service {

	List<String> routes;
	
	public Service( String name, String[] routes ) {
		this.routes = Arrays.asList(routes);
	}
	
	public List<String> getRoutes() {
		return routes;
	}

	public abstract List<String> getRoutesForUser(String userId );
	
	@Override
	public String toString() {
		return routes.toString();
	}

}
