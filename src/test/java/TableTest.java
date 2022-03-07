import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @Test
    public void tableCss() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

        WebElement el = wd.findElement(By.cssSelector("#customers td:last-child"));

    }

    @Test
    public void homework() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("file:///C:/Users/noamk/Downloads/index.html");

        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item1_2 = wd.findElement(By.cssSelector("#nav ul li:first-child a"));
        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item2_2 = wd.findElement(By.cssSelector("#nav ul li:nth-child(2) a"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item3_2 = wd.findElement(By.cssSelector("#nav ul li:nth-child(3) a"));
        WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));
        WebElement item4_2 = wd.findElement(By.cssSelector("#nav ul li:last-child a"));

        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputName2 = wd.findElement(By.cssSelector("[name='name']"));

        WebElement inputSurename = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement inputSurename2 = wd.findElement(By.cssSelector("[name='surename']"));

        WebElement button = wd.findElement(By.cssSelector(".btn"));

        WebElement Europe = wd.findElement(By.cssSelector("tr:first-child td:first-child"));
        WebElement Asia = wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement America = wd.findElement(By.cssSelector("tr:first-child td:last-child"));

        WebElement Ukraine = wd.findElement(By.cssSelector("tr:nth-child(2) td:first-child"));
        WebElement Israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement USA = wd.findElement(By.cssSelector("tr:nth-child(2) td:last-child"));
        WebElement Germany = wd.findElement(By.cssSelector("tr:nth-child(3) td:first-child"));
        WebElement Russia = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement Canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        WebElement Poland = wd.findElement(By.cssSelector("tr:last-child td:first-child"));
        WebElement Chine = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        WebElement Mexico = wd.findElement(By.cssSelector("tr:last-child td:last-child"));

        WebElement RedSquare = wd.findElement(By.cssSelector("#alert"));


    }

}
