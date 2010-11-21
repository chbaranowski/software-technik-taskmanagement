package task.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationUtil {
	
	public static String getProperty(String key){
		return getConfiguration("task").getProperty(key);
	}
	
	public static Properties getConfiguration(String name){
		String enviornment = getEnv();
		Properties props = new Properties();
		try {
			String filename = "/conf/"+enviornment+"/"+name+".properties";
			InputStream resourceAsStream = ConfigurationUtil.class.getResourceAsStream(filename);
			props.load(resourceAsStream);
		} catch (IOException exp) {
			throw new RuntimeException(exp);
		}
		return props;
	}

	public static String getEnv() {
		String env = System.getProperty("env");
		if(env == null)
			return "develop";
		return env;
	}
	
}
