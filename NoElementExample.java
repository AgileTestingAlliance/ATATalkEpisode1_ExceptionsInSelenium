package handlingExceptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.*;

public class NoElementExample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.5elementslearning.dev/demosite");
		try {
			driver.findElement(By.linkText("Junk")).click();
		}catch(NotFoundException ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
		driver.close();
	}

}
