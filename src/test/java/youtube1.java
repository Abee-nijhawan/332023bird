import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class youtube1 {
	public static void main(String [] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement products=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		Select select=new Select(products);
		select.selectByIndex(0);
		Thread.sleep(5000);
		WebDriverWait diver=new WebDriverWait(diver,Duration.of(10, null));
		FluentWait wait=new FluentWait(driver);
		mywait.until(Expected)
		Assert.assertEquals(a>b,"a is greater than b");
		
		
		
		
		
		
		
		public class dataprovider_Demo {
			WebDriver driver;

			@BeforeClass
			void setup()
			{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}

			@Test(dataProvider="dp")
			void testLogin(String email, String pwd)
			{
			driver.get("https://demo.nopcommerce.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

			String exp_title = "nopCommerce demo store";
			String act_title = driver.getTitle();

			Assert.assertEquals(exp_title, act_title);
			}

			@AfterClass
			void tearDown()
			{
			driver.close();
			}

			@DataProvider(name="dp" ,indices= {0,1,4})
			String [][] loginData()
			{
			String data[][]= {
			{ "abc11@gmail.com", "test123" },
			{ "pavanol@gmail.com", "test@123" },
			{ "pavanoltraining@gmail.com", "test3" },
			{ "pavanoltraining@gmail.com", "test@123" },
			{ "pavanoltraining@gmail.com", "test@123" }
			};

			return data;
			}



			}


		
		
		
	
		
		
	}

}
