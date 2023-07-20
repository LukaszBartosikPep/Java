import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class scrapper {
    public static void main(String[] args) {
        // Set the path to the Internet Explorer driver executable
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");

        // Create a new instance of the InternetExplorerDriver
        WebDriver driver = new InternetExplorerDriver();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Get the title of the page and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}