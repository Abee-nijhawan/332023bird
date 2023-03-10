import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test(priority=1)
  public void f() {
	  System.out.println("king");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("befor test");
  }

  @AfterTest()
  public void afterTest() {
	  System.out.println("After test");
	  
  }
  @BeforeSuit()
  public void beforesuit() {
	  System.out.println("before suit");
	  
	  
	  
  }

}
