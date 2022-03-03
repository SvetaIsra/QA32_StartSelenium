import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;



public class StartPhoneBook {

    WebDriver wd;
@Test
    public void startPhoneBook(){
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
        List <WebElement> elements = wd.findElements(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();

        WebElement element = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("container"));
        //Assert


        // wd.close(); // close one tab
       // wd.quit(); // close all tabs


    }
}
