package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		
		//Loading properties file 
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);
		
		// Reading data from properties file 
		
		String url= propertiesobj.getProperty("appurl");
		String email= propertiesobj.getProperty("email");
		String password= propertiesobj.getProperty("password");
		String OrderID= propertiesobj.getProperty("orderid");
		String customerid= propertiesobj.getProperty("customerid");
		
		System.out.println(url+"   "+email+"    "+password+"   "+OrderID+"   "+customerid+"    ");
		
		// reading only all the keys from properties --- 2 ways
		
		Set<String> keysOneWay=propertiesobj.stringPropertyNames();
		System.out.println(keysOneWay); // [password , orderid, customer id , app]
		
		Set<Object> keysSecondWay=propertiesobj.keySet();
		System.out.println(keysSecondWay);
		
		
		//reading only all the values from properties 
		
		Collection<Object> values = propertiesobj.values();
		System.out.println(values);
			
			file.close();
		
	}

}
