package verifications;

import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;
import pages.*;

public class Register extends TestsConfigurations{
//    HomePage homePage;
//    MainMenuPage mainMenuPage;
//    SignUpLoginPage signUpLoginPage;
//    SignUpPage signUpPage;
//    ContinuePage continuePage;
//    DeletePage deletePage;
//SHAFT.GUI.WebDriver driver;


    @Test
    public void RegisterUser() {

        new HomePage(driver)
                .NavigateTo("http://automationexercise.com");
//                .HomePageIsVisiableAssertion("Automation Exercise");

        new MainMenuPage(driver)
                .LoginSignUpLinkFromHome();

        new SignUpLoginPage(driver)
                .SignUpWithNameAndEmail("Shereen","shereen101@gmail.com");

        new SignUpPage(driver)
                .EnterAccountInformationIsVisible("ENTER ACCOUNT INFORMATION")
                .FillAccountInformation("12345","4","5","2000")
                .CheckBoxes()
                .FillAddressInformation("Shereen","Saad","VOIS","Dallah","Smart Village","Canada","Giza","hadayek alahram","122456","01116281020");

        new ContinuePage(driver)
                .AccountCreatedIsVisible("ACCOUNT CREATED!")
                .ClickOnContinueButton();

        new MainMenuPage(driver)
                .LoggedInAsUsernameIsVisible("Logged in as Shereen")
                .ClickOnDeleteButton();


        new DeletePage(driver)
                .AccountDeletedIsVisible();
    }
    //    ---------------Configurations---------------
//    @BeforeMethod
//    public void setup(){
//        driver=new ChromeDriver();
////        driver.navigate().to("http://automationexercise.com");
//        driver.manage().window().maximize();
////         homePage =new HomePage(driver);
////         mainMenuPage=new MainMenuPage(driver);
////         signUpLoginPage=new SignUpLoginPage(driver);
////         signUpPage =new SignUpPage(driver);
////         continuePage=new ContinuePage(driver);
////         deletePage= new DeletePage(driver);
//
//    }
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}
