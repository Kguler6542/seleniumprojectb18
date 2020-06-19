package test.day6_testng_dropdowns;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGPractice {

    @BeforeClass
    public void before_class(){
        System.out.println("BeforeCLASS is running! ----------------");
    }

    @AfterClass
    public void after_class(){
        System.out.println("AfterCLASS is running! -----------------");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running...");
    }

    @Test
    public void test1(){
        System.out.println("Test1 is running...");

        String actualTitle = "Homepage"; //driver.getTitle();
        String expectedTitle = "Homepage";

        Assert.assertEquals(actualTitle, expectedTitle);

//        if(actualTitle.equals(expectedTitle)){
//            System.out.println("Title verification passed!");
//        }else{
//            System.out.println("Title verification failed!!!");
//        }

    }

    @Test
    public void test2(){
        System.out.println("Test2 is running...");
    }




}