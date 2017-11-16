package object_repository_pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.By;;


public class BBDPre_signonPage 
{
@FindBy(xpath="//input[@type='text']")
private WebElement UID;
@FindBy(xpath="(//input[@type='password'])[1]")
private WebElement TokenNumber;
@FindBy(xpath="(//input[@type='password'])[2]")
private WebElement PIN;
@FindBy(xpath="//input[@type='checkbox']")
private WebElement Remember_user_Id;
@FindBy(xpath="//a[@href='/wp/wps/portal/bbdhdtokenactivate']")
private WebElement Activate_your_token;
@FindBy(xpath="//a[.='Forgot your PIN?']")
private WebElement Forgot_your_pin;
@FindBy(xpath="(//input[@type='submit'])[4]")
private WebElement Sign_on;
@FindBy(xpath="(//td[@class='inlineError'])[1]")
private WebElement errormsg;

public BBDPre_signonPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setUserID(String Un)
{
	UID.sendKeys(Un);
}

public void setTokennumber(String Tn)
{
	TokenNumber.sendKeys(Tn);
}
public void setPIN(String pn)
{
	PIN.sendKeys(pn);
}
public void setRememberUserID()
{
	Remember_user_Id.click();
}
public void setActiveyourtokenLink()
{
	Activate_your_token.click();	
}
public void setforgotYourPIN()
{
	Forgot_your_pin.click();
}
public void setSignON()
{
	Sign_on.click();
}
public void verifyErrorMessageIsDisplayed(WebDriver driver)
{
	WebDriverWait wait = new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		Reporter.log("PASS:Error mrssage is displayed" ,true);
	}
	catch(Exception e)
	{
		Reporter.log("Fail:Error mrssage is not displayed" ,true);
	}
	Assert.fail();
}
}
