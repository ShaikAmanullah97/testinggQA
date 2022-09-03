package helloAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SK Aman\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // prompt box Alert example send keys.


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();

        Thread.sleep(3000);

        Alert prompt =driver.switchTo().alert();
        System.out.println("The message is displayed on the alert:"+prompt.getText());

        prompt.sendKeys("shaik amanullah");
        Thread.sleep(2000);
        prompt.accept();
        Thread.sleep(5000);
        driver.quit();
    }

	}


