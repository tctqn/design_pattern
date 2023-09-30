package creational_design_patterns.singleton.demo.lazy;

public class Captain {
	private static Captain captain;
	
	private Captain() {
	}
	
	//"synchronized" --> multiple threads cannot involve in the instantiation process 
	//						at the same time
	public synchronized static Captain getInstances() {
		// Lazy initialization
		if(captain == null) {
			System.out.println("Your team choose captain successfully!");
			captain = new Captain();
		} else {
			System.out.println("Your team already have captain!");
		}
		return captain;
	}
}
