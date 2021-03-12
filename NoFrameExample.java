package handlingExceptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.*;

public class NoFrameExample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/iframe");
		try {
			driver.switchTo().frame("frame1");
			
		}catch(NotFoundException ex) {
			System.out.println("Exception: "+ex.getMessage());
		}
		driver.close();
		
	}

}
