package creational_design_patterns.singleton.demo.eager;

public class Captain {
	private static Captain captain = new Captain();
	
	private Captain() {
	}
	
	//"synchronized" --> multiple threads cannot involve in the instantiation process 
	//						at the same time
	public synchronized static Captain getInstances() {
		return captain;
	}
}
