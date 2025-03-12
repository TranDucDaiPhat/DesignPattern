package test;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> items = new ArrayList<>();
	
	public void addItem(Component item) {
        items.add(item);
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Component item : items) {
            total += item.calculateTotal();
        }
        return total;
    }
}
