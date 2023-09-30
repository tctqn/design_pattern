package creational_design_patterns.singleton.demo.billpugh;

public class Captain {
	private static Captain captain;
	
	private Captain() {
	}
	
	static {
		
		try {
			captain = new Captain();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}
	
	//"synchronized" --> multiple threads cannot involve in the instantiation process 
	//						at the same time
	public synchronized static Captain getInstances() {
		return captain;
	}
}
