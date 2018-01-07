import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium
{
    private static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void checkTitle()
    {
        String title = driver.getTitle();

        Assert.assertEquals(true, driver.getTitle().contains("Welcome"));
    }

    @Test
    public void checkWelcome()
    {
        WebElement e = driver.findElement(By.linkText("Welcome"));

        Assert.assertEquals(true, e.getAttribute("href").contains("welcome.html"));
    }

    @Test
    public void checkOurPassion()
    {
        WebElement e = driver.findElement(By.linkText("Our Passion"));

        Assert.assertEquals(true, e.getAttribute("href").contains("our-passion.html"));
    }

    @Test
    public void Menu()
    {
        WebElement e = driver.findElement(By.linkText("Menu"));

        Assert.assertEquals(true, e.getAttribute("href").contains("menu.html"));
    }

    @Test
    public void LetsTalkTea()
    {
        WebElement e = driver.findElement(By.linkText("Let's Talk Tea"));

        Assert.assertEquals((true), e.getAttribute("href").contains("let-s-talk-tea.html"));
    }

    @Test
    public void CheckOut()
    {
        WebElement e = driver.findElement(By.linkText("Check Out"));

        Assert.assertEquals(true, e.getAttribute("href").contains("check-out.html"));
    }
}
