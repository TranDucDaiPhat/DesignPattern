package test;

import app.AppConfig;

public class TestConfig {
	
	public static void main(String[] args) {
		AppConfig config1 = AppConfig.getInstace();
		System.out.println(config1);
		
		AppConfig config2 = AppConfig.getInstace();
		config2.setApiUrl("new Api");
		System.out.println(config1);
	}

}
