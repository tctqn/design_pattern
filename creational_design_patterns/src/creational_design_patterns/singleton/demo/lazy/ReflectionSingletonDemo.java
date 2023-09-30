package creational_design_patterns.singleton.demo.lazy;

import java.lang.reflect.Constructor;

public class ReflectionSingletonDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Captain c1 = Captain.getInstances();
		Captain c2 = null;

		try {
			Constructor[] constructors = Captain.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				System.out.println(constructor.getName());
				constructor.setAccessible(true);
				c2 = (Captain) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}
}
