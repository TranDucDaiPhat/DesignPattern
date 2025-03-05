package app;

public class AppConfig {
	
	private static AppConfig instance;
	
	private String apiUrl;
    private String databaseUrl;
    private int maxConnections;
	
	public static synchronized AppConfig getInstace() {
		if (instance == null) {
			instance = new AppConfig();
		}
		return instance;
	}
	
	private AppConfig() {
		this.apiUrl = "https://api.example.com";
        this.databaseUrl = "jdbc:mysql://localhost:3000/mydb";
        this.maxConnections = 10;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}

	@Override
	public String toString() {
		return "AppConfig [apiUrl=" + apiUrl + ", databaseUrl=" + databaseUrl + ", maxConnections=" + maxConnections
				+ "]";
	}
	
}
