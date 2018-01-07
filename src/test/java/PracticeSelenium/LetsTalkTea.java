package PracticeSelenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsTalkTea
{
    private static WebDriver driver;
    private static PracticeSelenium page;

    @BeforeClass
    public static void setUp()
    {
        page = new PracticeSelenium();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");

        driver.findElement(By.linkText("Let's Talk Tea")).click();
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void checkTitle()
    {
        String title = driver.getTitle();

        Assert.assertEquals(true, title.contains("Let's Talk Tea"));
    }

    @Test
    public void checkWelcome()
    {
        page.checkWelcome(driver);
    }

    @Test
    public void checkOurPassion()
    {
        page.checkOurPassion(driver);
    }

    @Test
    public void checkMenu()
    {
        page.checkMenu(driver);
    }

    @Test
    public void checkLetsTalkTea()
    {
        page.checkLetsTalkTea(driver);
    }

    @Test
    public void checkCheckOut()
    {
        page.checkCheckOut(driver);
    }

}
