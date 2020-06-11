package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitle {

    public static void main(String[] args) {


        // set up my webdriver
             WebDriverManager.chromedriver().setup();
        //create an instance of my driver
            WebDriver driver= new ChromeDriver();
        //make the browser full screen
            driver.manage().window().maximize();
        // go to gooogle.com
            driver.get("https://www.google.com");
        //verify title : expected : Google

          String actualTitle= driver.getTitle();
          String expectedTitle="Google";

        if(actualTitle.equals(expectedTitle)){
          System.out.println("Google title  PASSED");
         }else{
            System.out.println("Google title FAILED");
      }
    }
}
