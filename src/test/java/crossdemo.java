import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossdemo {
	
	@Test(priority=2)
	public void stat() {
		System.out.println("king");
	}
		@Test(priority=1)
		public void hashcode() {
			System.out.println("jbl");
			WebDriver driver=new ChromeDriver();
			driver.get("https://intellipaat.com/blog/tutorial/selenium-tutorial/recording-of-a-test/");
			
		}
		@Test(priority=3)
		public int gh(int a, int b) {
			return (a+b);
		}
		@Test
		public boolean iseven(int a) {
			if(a<0) {
				return false;
			}
			else if (a%2==0) {
				return ture;
			}
			else return false;
		}
		
		
	

	}
	
	
	


	

	
	


