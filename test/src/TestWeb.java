import org.testng.annotations.Test;


public class TestWeb extends BaseClass{
	
	@Test
	public void test1() {
		System.out.println("Test1");
		getWebDriver().get("http://google.com");
		getWebDriver().close();
		}
	
	/*@Test
	public void test2() {
		System.out.println("Test2");
		getWebDriver().get("http://qaclickacademy.com/practice.php");
		
		}*/

}
