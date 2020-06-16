package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) throws InterruptedException {


        //TC	#2:	SeleniumEasy	CheckboxVerification–Section	1
        // 1.Open	Chrome	browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // WebDriver driver = WebDriverFactorry.get
        driver.manage().window().maximize();
        //driver.manage.win.max

        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //driver. get

        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.

        WebElement succCb= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        WebElement sucM = driver.findElement(By.xpath("//div[@id='txtAge']"));
        //WebElemenet x= driver.findElement

        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        Thread.sleep(2000);
         succCb.click();


        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed

        if(sucM.isDisplayed()){
            System.out.println("pass");
        }else
            System.out.println("not pas");

        driver.quit();
    }
}
