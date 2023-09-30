package creational_design_patterns.singleton.demo.staticblock;

public class Captain {
	
	private Captain() {
	}
	
	/*
	 	Notice: the private inner static class that contains the instance of the singleton class. 
	 	When the singleton class is loaded, SingletonHelper class is not loaded into memory and
	 	only when someone calls the getInstance() method, this class gets loaded and creates 
	 	the singleton class instance. This is the most widely used approach for the singleton 
	 	class as it doesn’t require synchronization.
	 */
	
	private static class SingletonHelper {
		private static final Captain captain = new Captain();
	}
	
	//"synchronized" --> multiple threads cannot involve in the instantiation process 
	//						at the same time
	public static Captain getInstances() {
		return SingletonHelper.captain;
	}
}
