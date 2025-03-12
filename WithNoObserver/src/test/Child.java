package test;

public class Child {

	private String name;
	
	public Child(String name) {
		this.name = name;
	}
	
	public void getNotify(String message) {
		System.out.println(" goi " + name + " ve " + message);
	}
	
}
