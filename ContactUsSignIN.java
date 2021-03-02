import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;


public class ContactUsSignIN {

    WebDriver driver;
    String URL = "http://automationpractice.com/index.php";

    @BeforeMethod
    public void init(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void register(){
        //Click on Sign in button
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        //Enter email
        driver.findElement(By.cssSelector("#email_create")).sendKeys("lala789@gmail.com");
        //Click create account
        driver.findElement(By.cssSelector("#SubmitCreate")).click();

        //za test@test.com na click Create an account dobila:
        //An account using this email address has already been registered. Please enter a valid password or request a new one.

        //Select Mrs
        driver.findElement(By.cssSelector("#uniform-id_gender2")).click();

        //Enter First name
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Renata");
        //Enter last name
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Testic");

        //Email već popunjen - provjera emaila

        //   Assert.assertEquals(
        // driver.findElement(By.cssSelector("#email")).getText(),
        //  "lala789@gmail.com"
        //   );


        //Enter password
        driver.findElement(By.cssSelector("#passwd")).sendKeys("1122pas");

        //select Day
        WebElement dayElement = driver.findElement(By.cssSelector("#days"));
        Select day = new Select(dayElement);
        day.selectByValue("5");


        //select Months
        WebElement monthElement = driver.findElement(By.cssSelector("#months"));
        Select month = new Select(monthElement);
        month.selectByValue("8");

        //select Year
        WebElement yearElement = driver.findElement(By.cssSelector("#years"));
        Select year = new Select(yearElement);
        //year.selectByValue("2000");  //select by value
        year.selectByIndex(15);          //select by index

        //enter address
        driver.findElement(By.cssSelector("#address1")).sendKeys("70 Oxsford Street");


        //Enter city
        driver.findElement(By.cssSelector("#city")).sendKeys("New York");


        //Select State New York
        WebElement stateElement = driver.findElement(By.cssSelector("#id_state"));
        Select state = new Select(stateElement);
        state.selectByValue("32");

        //Enter Zip/Postal code
        driver.findElement(By.cssSelector("#postcode")).sendKeys("10005");


        //Country
        WebElement countryElement = driver.findElement(By.cssSelector("#id_country"));
        Select country = new Select(countryElement);
        country.selectByValue("21");

        //Enter Mobile phone
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("091568423");


        //Assign address allias
        driver.findElement(By.cssSelector("#alias")).clear();
        driver.findElement(By.cssSelector("#alias")).sendKeys("Druga adresa");


        //Click Register
        driver.findElement(By.cssSelector("#submitAccount")).click();


    }
//    @Test
//    public void contactUs() {
//        Click on Contact Us button
//        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
//        WebElement subjectHeadingElement = driver.findElement(By.cssSelector("#id_contact"));
//        //Select "Customer service"
//        Select subjectHeadingSelect = new Select(subjectHeadingElement);
//        subjectHeadingSelect.selectByVisibleText("Customer service");
//
//        //Enter email address
//        driver.findElement(By.cssSelector("input[name='from']")).sendKeys("nekimail@gmail.com");
//
//        //Enter order id
//        driver.findElement(By.cssSelector("input[name='id_order']")).sendKeys("123");
//
//        //Enter message
//        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Poruka");
//
//        //Click se3nd button
//        driver.findElement(By.xpath("//button[@name='submitMessage']")).click();
//
//        Assert.assertEquals(
//                driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]")).getText(),
//                "Your message has been successfully sent to our team."
//        );
//
//        Assert.assertEquals(
//                driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]")).getCssValue("background-color"),
//                "rgba(85, 198, 94, 1)"
//        );
//
//        Assert.assertEquals(driver.getTitle(),"Contact us - My Store");
//
//    }
//
//    @Test
//    public void contactUsNoEmail(){
//        Click on Contact Us button
//        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
//        WebElement subjectHeadingElement = driver.findElement(By.cssSelector("#id_contact"));
//        //Select "Customer service"
//        Select subjectHeadingSelect = new Select(subjectHeadingElement);
//        subjectHeadingSelect.selectByVisibleText("Customer service");
//
//        //Enter order id
//        driver.findElement(By.cssSelector("input[name='id_order']")).sendKeys("123");
//
//        //Enter message
//        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Poruka");
//
//        //Click se3nd button
//        driver.findElement(By.xpath("//button[@name='submitMessage']")).click();
//
//        Assert.assertEquals(
//                driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]//li")).getText(),
//                "Invalid email address."
//        );
//
//        Assert.assertEquals(
//                driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getCssValue("background-color"),
//                "rgba(243, 81, 92, 1)"
//        );
//
//        Assert.assertEquals(driver.getTitle(),"Contact us - My Store");
//    }
//
//    @Test
//    public void contactUsSubjectHeadingText(){
//        Click on Contact Us button
//        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
//        WebElement subjectHeadingElement = driver.findElement(By.cssSelector("#id_contact"));
//        //Select "Customer service"
//        Select subjectHeadingSelect = new Select(subjectHeadingElement);
//        subjectHeadingSelect.selectByVisibleText("Customer service");
//
//        Assert.assertEquals(
//                driver.findElement(By.cssSelector("#desc_contact2")).getText(),
//                "For any question about a product, an order"
//        );
//
//        Assert.assertEquals(
//                driver.getTitle(),
//                "Contact us - My Store"
//        );
//    }

    }




