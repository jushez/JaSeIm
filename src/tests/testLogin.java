package tests;


import org.openqa.selenium.WebDriver;


public class testLogin {

    public static void main(String[] args) {

        String browserType = "chrome";
        WebDriver driver;

        // 1. Initialize driver
        driver = utilities.DriverFactory.open(browserType);
        driver.get("http://1bk.cf8.myftpupload.com/");


        // 2. Enter login information (Login Page)


        // 3. Get Confirmation (Dashboard Page);


        // 4. Close the driver
    }

}
