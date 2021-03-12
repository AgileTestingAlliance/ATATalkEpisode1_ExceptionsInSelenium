package handlingExceptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.*;

public class NoAlertExample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.5elementslearning.dev/demosite");
		Thread.sleep(2000);
		try {
			Alert alertObj= driver.switchTo().alert();
			alertObj.accept();
		}catch(NotFoundException ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
		driver.close();
		
	}

}
