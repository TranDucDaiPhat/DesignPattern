package test;

import factory.Animal;
import factory.AnimalFactory;
import factory.Type;

public class Test {
	
	public static void main(String[] args) {
		Animal buffalo = AnimalFactory.getAnimal(Type.BUFFALO);
		System.out.println(buffalo.getSound());
	}

}
