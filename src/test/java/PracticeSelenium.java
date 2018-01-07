import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeSelenium
{

    public void checkWelcome(WebDriver driver)
    {
        WebElement e = driver.findElement(By.linkText("Welcome"));

        Assert.assertEquals(true, e.getAttribute("href").contains("welcome.html"));
    }

    public void checkOurPassion(WebDriver driver)
    {
        WebElement e = driver.findElement(By.linkText("Our Passion"));

        Assert.assertEquals(true, e.getAttribute("href").contains("our-passion.html"));
    }

    public void checkMenu(WebDriver driver)
    {
        WebElement e = driver.findElement(By.linkText("Menu"));

        Assert.assertEquals(true, e.getAttribute("href").contains("menu.html"));
    }

    public void checkLetsTalkTea(WebDriver driver)
    {
        WebElement e = driver.findElement(By.linkText("Let's Talk Tea"));

        Assert.assertEquals((true), e.getAttribute("href").contains("let-s-talk-tea.html"));
    }

    public void checkCheckOut(WebDriver driver)
    {
        WebElement e = driver.findElement(By.linkText("Check Out"));

        Assert.assertEquals(true, e.getAttribute("href").contains("check-out.html"));
    }
}
