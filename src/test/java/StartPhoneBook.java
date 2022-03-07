import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;



public class StartPhoneBook {

    WebDriver wd;

    @Test
    public void startPhoneBook() {
        wd = new ChromeDriver();
        //  wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");

        wd.manage().window().maximize();

        // steps of test login
        // open login form --- find loginbtn + click
        //fill email --- find email element + click+clear+type email
        //fill password ---find password element + click+clear+type password
        //click login btn --- find login btn element+ click
        // WebElement el = wd.findElement(By.id("idel"));
        // List <WebElement> list = wd.findElements(By.id("idel"));
        //WebElement a = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

        WebElement element = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("container"));
        //Assert


        // wd.close(); // close one tab
        // wd.quit(); // close all tabs


    }

    @Test
    public void home() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();


        WebElement el1 = wd.findElement(By.tagName("body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement el4 = wd.findElement(By.tagName("a"));
        WebElement el5 = wd.findElement(By.tagName("input"));
        WebElement el6 = wd.findElement(By.tagName("br"));
        WebElement el7 = wd.findElement(By.tagName("button"));

        WebElement el8 = wd.findElement(By.id("root"));

        WebElement el9 = wd.findElement(By.className("container"));
        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.className("active"));
        WebElement el12 = wd.findElement(By.className("login_login__3EHKB"));

        // byLinkText
        WebElement el13 = wd.findElement(By.linkText("HOME"));
        WebElement el14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el15 = wd.findElement(By.linkText("LOGIN"));
        WebElement el16 = wd.findElement(By.partialLinkText("HO"));

    }

    @Test
    public void cssLocatorsTest() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector("input"));
        // by tag name
        wd.findElement(By.cssSelector("div"));
        // by class name
        wd.findElement(By.cssSelector(".login_login_3EHKB"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        // атребут
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder *='ss']"));
        wd.findElement(By.cssSelector("[placeholder ^='Pas']"));
        wd.findElement(By.cssSelector("[placeholder $='d']"));


    }

}
