package handlingExceptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.*;

public class NoWindowExample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.5elementslearning.dev/demosite");
		try {
			driver.switchTo().window("128839329320320");
		}catch(NotFoundException ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
		driver.close();
		
	}

}
