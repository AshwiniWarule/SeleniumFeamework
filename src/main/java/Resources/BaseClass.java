package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;

	

	public void initializeDriver() throws IOException {
		
		// This will access the file-- data.properties
		
		FileInputStream fis=new FileInputStream("E:\\JavaWorkspace\\TestingSeleniumFinalProject\\src\\main\\java\\Resources\\data.properties");
		
		// To read the file--- data.properties
		
        prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
	
		
     
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
	}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		
}
		else {
			System.out.println("please choose valid browser to run your scripts");
			
		}
		
		
	}
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
        initializeDriver();
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
	@AfterMethod

	public void quit() {
		driver.quit();
}
}
