package test;

class Table extends Composite {

	@Override
	public void addItem(Component item) {
		// Kiểm tra nếu item là Table hoặc Restaurant thì không cho phép thêm
		if (item instanceof Table || item instanceof Restaurant) {
			throw new IllegalArgumentException("Table không thể chứa Table hoặc Restaurant.");
		}
		super.addItem(item);
	}
}
