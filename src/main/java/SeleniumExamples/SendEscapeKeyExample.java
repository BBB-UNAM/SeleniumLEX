package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SendEscapeKeyExample {
    public static void main(String args[]) throws InterruptedException {
        InitialSetup initial = new InitialSetup("chrome");
        WebDriver driver = initial.instanceDriver();

        initial.setExplicitWait(driver,10);

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hola mundo");

        Thread.sleep(500);

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ESCAPE);

        driver.findElement(By.xpath("//*[@class='FPdoLc tfB0Bf']//*[@value='Buscar con Google']")).click();

        Thread.sleep(500);

        driver.quit();
        driver.close();
    }
}
