import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(priority=1)
  public void f() {
	  System.out.println("hii");
  }
  @BeforeMethod()
  public void beforeMethod() {
	  System.out.println("hello");
  }

  @AfterMethod()
  public void afterMethod() {
	  System.out.println("hehe");
	  
  }

}
