import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_User_Value extends BaseTest{

    @Test
    public void setFullName(){
        UserTextBoxPage userTextBoxPage = new UserTextBoxPage(driver);
        userTextBoxPage.setFullName("Esra Ceylan");
        Assertions.assertEquals("Esra Ceylan",userTextBoxPage.getFullName(),"Full Name value is not correct");
    }

    @Test
    public void setEmail(){
        UserTextBoxPage userTextBoxPage = new UserTextBoxPage(driver);
        userTextBoxPage.setEmail("esracyln@example.com");
        Assertions.assertEquals("esracyln@example.com",userTextBoxPage.getEmail(),"Email value is not correct");
    }

    @Test
    public void setUserCurrentAddress(){
        UserTextBoxPage userTextBoxPage = new UserTextBoxPage(driver);
        userTextBoxPage.setUserCurrentAddress("currentaddress");
        Assertions.assertEquals("currentaddress",userTextBoxPage.getCurrentAddress(),"Current Address is not correct");
    }

    @Test
    public void setUserPermanentAddress(){
        UserTextBoxPage userTextBoxPage = new UserTextBoxPage(driver);
        userTextBoxPage.setUserPermanentAddress("permanentaddress");
        Assertions.assertEquals("permanentaddress",userTextBoxPage.getPermanentAddress(),"Permanent Address is not corrected");
    }

    @Test
    public void submitButtonClick(){
        UserTextBoxPage userTextBoxPage = new UserTextBoxPage(driver);
        userTextBoxPage.submitButton();
    }

}
