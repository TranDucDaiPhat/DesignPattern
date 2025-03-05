package factory;

public class AnimalFactory {

	public static final Animal getAnimal(Type type) {
		switch (type) {
		 
        case BUFFALO:
            return new Buffalo();
 
        case DUCK:
            return new Duck();
            
        case PIG:
            return new Pig();
 
        default:
            throw new IllegalArgumentException("This bank type is unsupported");
        }
	}
}
