package object_repository_pages;

<<<<<<< HEAD
public class BBDPre_signonPage
{
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
>>>>>>> branch 'master' of https://github.com/Dipayan94/com.project1

}
