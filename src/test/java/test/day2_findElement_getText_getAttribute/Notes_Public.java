package test.day2_findElement_getText_getAttribute;

public class Notes_Public {
    /*

                SELENIUM Sheat Cheet
Clear out a textbox
driver.findElement(By.id("id")).clear();
Get the text of a webelement
driver.findElement(By.id("id")).getText();
Send text/keys to the webelement
driver.findElement(By.id("id")).sendKeys("Hello!");
Get attribute of webelement
driver.findElement(By.id("id")).getAttribute("value");
Get attribute of webelement
driver.findElement(By.id("id")).getAttribute("value");
Click a webelement
driver.findElement(By.id("id")).click();
Check an element is enabled or not (true/false boolean)
driver.findElement(By.id("id")).isEnabled();
**Check an element is displayed or not (true/false boolean)**
driver.findElement(By.id("id")).isDisplayed();
Check an element is selected or not (true/false boolean)
driver.findElement(By.id("id")).isSelected();
Get current page title
driver.getTitle();
Get the value attribue of a webelement (e.g - current text in the textbox)
driver.findElement(By.id("id")).getValue();
Navigating using your driver:
Go to a particular website
driver.navigate().to("http://www.google.com");
Go to a particular website
driver.get("http://www.google.com");
Refresh the page
driver.navigate().refresh();
Go Back a page
driver.navigate().back();
Go Forward a page
driver.navigate().forward();

                        ***** Locating Elements ****
Selenium offers an array of methods to locate webelements on the page, best coupled with PageObjectModel to create objects of your pages for easy reuse and more stable/less brittle testing. The main locators are outlined below:
XPATH - Traversing through the entire document, very powerful but pretty slow, always opt for ID before this if available.
This locates the second input element beneath the element with an id value of ‘register’
driver.findElement(By.xpath(“//input[@id=’myElementId’]”));
CSS - Finding an element based on the css class attribute, faster than Xpath but still use ID if you have it available to you.
driver.findElement(By.cssSelector(“h1[title]”);
ID - Finding an element by its ID attribute - blazing fast and always best to use if applicable
driver.findElement(By.id("abc")).click();
Name - Similar to ID, we are finding by the name attribute
driver.findElement(By.name("abc"));
Linktext - Partial Linktext is also available, essentially the text on the element, avoid if you can, there could be multiple things with the same value on the page and this will use the first one.
driver.findElement(By.linkText(“Click Me!”));
driver.findElement(By.partialLinkText("Click M"));
Tagname - Uses the tag attribue to find an element, not really recommended outside of getting the page header/title
driver.findElement(By.tagName("h1"));
Classname - Finding an element by the class name attribute
driver.findElement(By.classname("date-header"));
                        *****Selenium Exceptions*****
Selenium has a number of different exceptions associated with it,
ElementNotVisibleException -> Element is present in the DOM (Document Object Model) but it is not visible, thus we are not able to interact with it.
NoSuchAttributeException -> Looking for an attribue that does not exist on an element, for example By.id("abc").getAttribute("wrong");
NoSuchElementException -> Element simply cannot be found, Fluent/Implicit/explicit wait has expired
NoSuchFrameException -> Switching to a frame which does not exist
NoSuchWindowException -> Switch to a window which does not exist
StaleElementReferenceException -> When the DOM has been updated after you have a reference to a webelement causing it to go stale, calling methods on your now stale element will throw this.
Interacting with Frames/Windows
In selenium sometimes we need to change our focus to another window, in order to do that we need to get our current window handle, perhaps get all available windows handles and make the switch, remembering to switch back after:
String current = driver.getWindowHandle(); //Return a string of alphanumeric window handle
Set<String> Handles = driver.getWindowHandles(); //Return a set of window handle
driver.switchTo().window("windowName");
driver.switchTo().window(current);
In order to switch to a different frame/alert, we use this simply syntax:
Alert alert = driver.switchTo().alert();
Alert alert = driver.switchTo().alert();
alert.dismiss();
alert.accept();
alert.getText();
By typing driver. syntax we get below list of methods,
Selenium browser commands
Now let us go through the different Browser commands and methods which Selenium uses to interact with an HTML page.
Key Selenium browser Commands
Get Commands
get (String args0) : void – This method is used to load the web application on the active webdriver. The return type is void and accepts String as a parameter.
Syntax – driver.get(“<URL>”);
How to use the above method in script?
String website = “http://techcanvass.com/”;
driver.get(website);
OR
driver.get(“http://techcanvass.com/”);
The above code will load Techcanvass website.
Get Title Command
getTitle() : String – This method is used to fetch the title of the web page. The return type is String and it accepts nothing as parameter.
Syntax – driver.getTitle();
How to use the above method in script?
driver.get(“http://techcanvass.com/”);
String title=driver.getTitle();
System.out.println(“Title “+title);
The above code will fetch the title of Techcanvass website and display on consol.
Get Current URL Command
getCurrentUrl() : String – This method is used to fetch the URL of the web page which webdriver is currently active. The return type is String and it accepts nothing as parameter.
Syntax – driver. getCurrentUrl();
How to use the above method in script?
String CurrentURL = driver.getCurrentUrl();
System.out.println(“Current URL “+CurrentURL);
OR
System.out.println(driver.getCurrentUrl());
Now let us learn how to use getCurrentUrl() method through an example:
driver.get(“http://techcanvass.com/”);
System.out.println(driver.getCurrentUrl());
The above code will fetch the URL of Techcanvass website and display on console.
Get Page Source Command
getPageSource() : String – This method is used to fetch the page source of the web page which webdriver is currently active. The return type is String and it accepts nothing as parameter.
Syntax – driver. getPageSource ();
How to use the above method in script?
String PageSource = driver. getPageSource ();
System.out.println(“Page Source “+ PageSource);
OR
System.out.println(driver. getPageSource());
Now let us learn how to use getPageSource() method through an example:
driver.get(“http://techcanvass.com/”);
System.out.println(driver. getPageSource());
The above code will fetch the page source of Techcanvass website and display on console.
Close Command
close() : void – This method is used to close the active web  browser on which the webdriver is working. The return type of this method is void and it accepts nothing as parameter.
Syntax – driver.close();
Now let us learn how to use close() method through an example:
driver.get(“http://techcanvass.com/”);
driver.close();
The above code will close the Techcanvass window.
Quit Command
quit() : void – This method is used to close all the web  browsers which webdriver had opened. The return type of this method is void and it accepts nothing as parameter.
Syntax – driver.quit();
The above code will close the all the browsers opened by the webdriver

        *******************************************************************************
.-WebDriver is a tool for testing web applications across different browsers using different programming languages.
.-You are now able to make powerful tests because WebDriver allows you to use a programming language of your choice in designing your tests.
.-WebDriver is faster than Selenium RC because of its simpler architecture.
.-WebDriver directly talks to the browser while Selenium RC needs the help of the RC Server in order to do so.
.-WebDriver's API is more concise than Selenium RC's.
.-WebDriver can support HtmlUnit while Selenium RC cannot.
.-The only drawbacks of WebDriver are:
It cannot readily support new browsers, but Selenium RC can.
It does not have a built-in command for automatic generation of test results.
     */
}
