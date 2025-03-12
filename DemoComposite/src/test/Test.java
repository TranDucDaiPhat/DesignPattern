package test;

public class Test {

	public static void main(String[] args) {
		Product dish1 = new Product("Pasta", 1);
		Product dish2 = new Product("Pizza", 1);
		Product dish3 = new Product("Salad", 1);
		Product dish4 = new Product("Pasta", 1);
		Product dish5 = new Product("Pizza", 1);
		Product dish6 = new Product("Salad", 1);
		
		Table table1 = new Table();
		table1.addItem(dish1);
		table1.addItem(dish2);
		table1.addItem(dish3);
		
		Table table2 = new Table();
		table1.addItem(dish4);
		table1.addItem(dish5);
		table1.addItem(dish6);
		
		// Báo lỗi nếu thêm một table và một table khác
//		table1.addItem(table2);
		
		Restaurant nhaHang = new Restaurant();
		nhaHang.addItem(table1);
		nhaHang.addItem(table2);
		
		System.out.println(nhaHang.calculateTotal());
	}
}
