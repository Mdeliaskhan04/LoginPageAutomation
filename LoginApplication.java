import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginApplication {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        //Browser Open
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        //Open Url
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //TimeWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement userame= driver.findElement(By.name("username"));
        //UserName Field Exists?
        userame.isDisplayed();

        if(userame.isDisplayed()) {
            //Clear Input Field
            userame.clear();
            //Send value to the username Field
            userame.sendKeys("Admin");
        }
        else {
            System.out.println("Username Input Field Not Found!!!");
        }

        WebElement password=driver.findElement(By.name("password"));
        //Password Field Exists?
        password.isDisplayed();

        if(password.isDisplayed()) {
            //Clear Password Field
            password.clear();
            //Send value to the password field
            password.sendKeys("admin123");
        }
        else {
            System.out.println("Password Input Field Not Found!!!!");
        }

        driver.findElement(By.xpath("//button[@type='submit']")).click();

       String ActualPageTitle = driver.getTitle();
       String ExpectedPageTitle = "OrangeHRM";

        System.out.println(ActualPageTitle);
        System.out.println(ExpectedPageTitle);
        if (ActualPageTitle.contentEquals(ExpectedPageTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }



    }
}
