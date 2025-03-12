package test;

import java.util.ArrayList;
import java.util.List;

public class Father {

	private List<Child> list = new ArrayList<Child>();

	private State state;

	public void addChild(Child child) {
		list.add(child);
	}

	public void changeState(State state) {
		switch (state) {
		case LAU_NHA: {
			this.state = state;
			notifyAllToChild("lau nha");
			break;
		}
		case NAU_COM: {
			this.state = state;
			notifyAllToChild("nau com");
			break;
		}
		case RUA_BAT: {
			this.state = state;
			notifyAllToChild("rua bat");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + state);
		}
	}

	public void notifyAllToChild(String s) {
		for (Child c : list) {
			c.getNotify(s);
		}
	}

}
