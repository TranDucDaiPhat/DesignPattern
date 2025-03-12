package test;

class Restaurant extends Composite {

	@Override
	public void addItem(Component item) {
		// Kiểm tra nếu item là Restaurant thì không cho phép thêm
		if (item instanceof Restaurant) {
			throw new IllegalArgumentException("Restaurant không thể chứa Restaurant.");
		}
		super.addItem(item);
	}
}
