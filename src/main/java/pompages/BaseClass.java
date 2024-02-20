package pompages;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class  BaseClass {
	public String path;
	public FileInputStream fis;
	public Properties pis;
	 
	public BaseClass() throws IOException   {
		path = System.getProperty("user.dir")+"//Config.properties";
		fis = new FileInputStream(path) ;  
		Properties Prop = new Properties();
		Prop.load(fis);
		
	}
	

}
