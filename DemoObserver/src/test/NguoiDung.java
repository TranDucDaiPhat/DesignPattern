package test;

public class NguoiDung implements Observer{
	
	private String name;
	
	public NguoiDung(String name) {
		this.name = name;
	}

	@Override
	public void update(String mesage) {
		System.out.println("thong bao cho nguoi dung " + name + ": " + mesage);
		
	}

}
