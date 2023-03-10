import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testngmrngpract {
  @Test(priority=1,groups= {"sanity","regression"})
  public void f() {
	  System.out.println('a');
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println('b');
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println('c');
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println('d');
  }

  @AfterClass
  public void afterClass() {
	  System.out.println('e');
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println('f');
  }

  @AfterTest
  public void afterTest() {
  
  System.out.println('g');
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println('h');
  }

  @AfterSuite
  public void afterSuite() {
  
  System.out.println('i');
  }
}

