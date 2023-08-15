package verifications;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import utilities.DriverFactory;

public class TestsConfigurations {
    SHAFT.GUI.WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new SHAFT.GUI.WebDriver();
//         driver=new ChromeDriver();
//        driver= DriverFactory.getDriver("Chrome",true);
//         driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
