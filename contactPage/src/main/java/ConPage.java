import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ConPage
{
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Supriya\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://classic.freecrm.com/index.html");
            driver.manage().window().maximize();
            WebElement user =driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
            WebElement pwd =driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
            user.sendKeys("SupriyaPatil");
            pwd.sendKeys("SupriyaPatil");
            WebElement login=driver.findElement(By.xpath("//input[@type = 'submit']"));
            login.click();
            driver.switchTo().frame("mainpanel");
            WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
            contact.click();
           // driver.navigate().back();
            Thread.sleep(1000);
            //driver.switchTo().frame("mainpanel");
            WebElement contact1 = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
            Actions actions=new Actions(driver);
            actions.clickAndHold(contact1).build().perform();
            WebElement newContact=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[1]/a"));
            Actions actions1=new Actions(driver);
            actions.clickAndHold(newContact).build().perform();
            newContact.click();
            //WebElement newContact1=driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
            //newContact1.click();
           Thread.sleep(5000);
        
         System.out.println("This is git pull Change");


        }
    }


