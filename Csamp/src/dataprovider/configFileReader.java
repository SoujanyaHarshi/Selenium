package dataprovider;

import java.util.Properties;

import org.openqa.selenium.By;

public class configFileReader {
	public Properties prop;
	public final String propfilepath ="config//configure.properties";
	
	public String getDP()
	{
		String dp=prop.getProperty("DriverPath");
		return dp;
	}
	
	public long getWait()
	{
		String wait=prop.getProperty("implicitlyWait");
		return 0;
		}
	
	public String url()
	{
		String urlo=prop.getProperty("url");
		return urlo;
	}
	
	/*public user() {
		String user1=prop.setProperty(, );
		return user1;
	}
	public String pswd() {
		String pass=prop.getProperty("password");
		return pass;
	}*/	


}
