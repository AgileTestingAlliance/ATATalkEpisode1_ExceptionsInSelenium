package handlingExceptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.*;

public class ElementNotInteractableException {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html"); 
		Select skillsDropDown = new Select(driver.findElement(By.name("skills")));
		try {
			skillsDropDown.selectByIndex(1);
			if(skillsDropDown.getWrappedElement().isDisplayed()) {
				
				
			}else {
				System.out.println("Element is Hidden");
				Thread.sleep(3000);
			}
		}catch(WebDriverException ex) {
			System.out.println(ex.getMessage());
		}
		driver.quit();
	}

}
