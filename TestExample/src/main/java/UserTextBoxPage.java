import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UserTextBoxPage extends BasePage{
    private final By userFullNameLocator = By.id("userName");
    private final By userEmailLocator = By.id("userEmail");
    private final By userCurrentAddressLocator = By.id("currentAddress");

    private final By userPermanentAddressLocator = By.id("permanentAddress");
    private final By submitButtonLocator = By.id("submit");

    public UserTextBoxPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("text-box"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,280)");
    }

    public void setFullName(String name){
        type(userFullNameLocator,name);
    }

    public void setEmail(String email){
        type(userEmailLocator,email);
    }

    public void setUserCurrentAddress(String currentAddress){
        type(userCurrentAddressLocator,currentAddress);
    }

    public void setUserPermanentAddress(String permanentAddress){
        type(userPermanentAddressLocator,permanentAddress);
    }

    public String getFullName(){
        return find(userFullNameLocator).getAttribute("value");
    }

    public String getEmail(){
        return find(userEmailLocator).getAttribute("value");
    }

    public String getCurrentAddress(){
        return find(userCurrentAddressLocator).getAttribute("value");
    }
    public String getPermanentAddress(){
        return find(userPermanentAddressLocator).getAttribute("value");
    }

    public void submitButton(){
        click(submitButtonLocator);
    }
}
