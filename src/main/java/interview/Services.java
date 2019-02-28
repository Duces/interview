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

	public List<String> getServiceNames() {
		List<String> serviceNames = new ArrayList<String>();
		
		for( Service service : services ) {
			serviceNames.add(service.getName());
		}
		
		return serviceNames;
	}
	
	public List<String> getRoutes() {
		return getRoutesAsList();
	}
	
	public List<String> getUniqueRoutes() {
		return new ArrayList<String>( new HashSet<String>(getRoutesAsList()));
	}

	public List<String> getRoutesForUser(String userId) {
		return getRoutesAsListForUser(userId);
	}
	
	public List<String> getRoutesForUser( List<Service> services, String userId ) {
		return getRoutesAsListForUser(userId);
	}

}
