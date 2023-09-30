package creational_design_patterns.singleton.demo.billpugh;

public class SingletonExample {
	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***");
		System.out.println("Trying to make a captain for your team:");
		Captain captain1 = Captain.getInstances();
		Captain captain2 = Captain.getInstances();
		if (captain1 == captain2) {
			System.out.println("captain1 and captain2 are same instance.");
		}
	}
	
}
