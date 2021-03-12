package handlingExceptions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.*;

public class StaleElementExample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String[] manufacturers=new String[4];
		manufacturers[0]="Canon";
		manufacturers[1]="Fox";
		manufacturers[2]="Logitech";
		manufacturers[3]="Matrox";
		
		driver.get("http://www.5elementslearning.dev/demosite");
		Select manufacSel;
		manufacSel=new Select(driver.findElement(By.name("manufacturers_id")));
		for(int i =0;i<=manufacturers.length;i++) {
			//manufacSel.selectByVisibleText(manufacturers[i]);
			//driver.navigate().back();
			//if we dont re-associate the element we get StaleElementException
			//manufacSel=new Select(driver.findElement(By.name("manufacturers_id")));
		}
		driver.close();
	}
}
