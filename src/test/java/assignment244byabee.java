import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment244byabee {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.manage().window().maximize();
		String expected1="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String exp2="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";		
		String exp3="https://www.flipkart.com/";
				
				String jm=driver.getTitle();
				if(jm.equals(expected1)) {
					System.out.println("passed");
				}
				else {
					System.out.println("not passed");
				}
		
		String jk=driver.getPageSource();
		String jh=driver.getTitle();
		if(jh.equals(exp2)) {
			System.out.println("passed");
		}
		else {
				System.out.println("not passed");
			}
		
		
		String jl=driver.getCurrentUrl();
		if(jl.equals(exp3)) {
			System.out.println("passed");
		}
		else {
			System.out.println("not passed");
		}
		
		
		
		
		driver.navigate().back();
		
		
	}

}
