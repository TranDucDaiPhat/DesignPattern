package test;

public class Test {

	public static void main(String[] args) {
		Father father = new Father();
		
		Child child1 = new Child("phat");
		Child child2 = new Child("quynh");
		Child child3 = new Child("bao");
		Child child4 = new Child("luan");
		
		father.addChild(child1);
		father.addChild(child2);
		father.addChild(child3);
		
		father.changeState(State.LAU_NHA);
		father.changeState(State.NAU_COM);
	}
}
