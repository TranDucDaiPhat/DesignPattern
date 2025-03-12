package test;

public class Test {
	
	public static void main(String[] args) {
		
		CoPhieu coPhieu1 = new CoPhieu();
		
		NguoiDung nd1 = new NguoiDung("Phat");
		
		NguoiDung nd2 = new NguoiDung("Bao");
		
		coPhieu1.attach(nd1);
		coPhieu1.attach(nd2);
		
		coPhieu1.notifyChange("co phieu tang gia");
	}

}
