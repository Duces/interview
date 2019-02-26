package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Services {

	private List<Service> services = null;
	
	public Services(List<Service> services) {
		this.services = services;
	}

	private List<String> getRoutesAsList() {
		List<String> allRoutes = new ArrayList<String>();
		
		for( Service service : services ) {
			allRoutes.addAll(service.getRoutes());
		}
		
		return allRoutes;
	}

	private List<String> getRoutesAsListForUser(String userId) {
		List<String> allRoutes = new ArrayList<String>();
		
		for( Service service : services ) {
			allRoutes.addAll(service.getRoutesForUser(userId));
		}
		
		return allRoutes;
	}

	public String getRoutes() {
		return getRoutesAsList().toString();
	}
	
	public String getUniqueRoutes() {
		return new HashSet<String>(getRoutesAsList()).toString();
		
	}
	
	public String getRoutesForUser(String userId) {
		return getRoutesAsListForUser(userId).toString();
	}
	
	public String getRoutesForUser( List<Service> services, String userId ) {
		return getRoutesAsListForUser(userId).toString();
	}

}
