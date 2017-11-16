package geberic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class BaseTest implements AutoConst{
	public WebDriver driver;

static
{

	System.setProperty(CHROME_KEY,CHROME_VALUE);
	//System.setProperty(GECKO_KEY, GECKO_VALUE);
}	
@BeforeMethod
public void openApplication()
{
	
	driver = new ChromeDriver();
	driver.get(APPURL);
}
@AfterMethod
public void closeApplication()
{
	driver.quit();
}
@Test
public void Message()
{
	System.out.println("Application opend succefully");
}
}
