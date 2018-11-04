import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void beforeMethod() throws IllegalAccessException{
		System.setProperty("webdriver.gecko.driver","./geckodriver");
		WebDriver driver = new WebDriverFactory().create("Firefox");
		setWebDriver(driver);
		
		getWebDriver().manage().window().maximize();
		
	}
	
	@AfterMethod
	public void afterMethod(){
		
		//driver.close();
		//driver.manage().window().maximize();
		
		//getWebDriver().close();
		dr.set(null);

	}
	
	public void setWebDriver(WebDriver driver){
		dr.set(driver);
	}
	
	public WebDriver getWebDriver(){
		return dr.get();
	}
}
