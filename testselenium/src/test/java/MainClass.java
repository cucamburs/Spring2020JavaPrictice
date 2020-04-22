import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\testselenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
    }
}