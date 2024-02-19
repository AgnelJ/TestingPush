package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class launchBrowser {
	public class InputFieldVerification {
		private ChromeDriver driver;
	    public  boolean verifyAllCombinations(WebElement inputField) {
	        Actions actions = new Actions(driver);

	        // Clear the input field
	        inputField.clear();

	        // Perform typing for each combination type
	        actions.sendKeys("abcABC").perform(); // Alpha
	        if (!inputField.getAttribute("value").matches("[a-zA-Z]+")) {
	            return false;
	        }

	        inputField.clear();
	        actions.sendKeys("123456").perform(); // Numeric
	        if (!inputField.getAttribute("value").matches("[0-9]+")) {
	            return false;
	        }

	        inputField.clear();
	        actions.sendKeys("!@#$%^").perform(); // Special
	        if (!inputField.getAttribute("value").matches("[!@#$%^]+")) {
	            return false;
	        }

	        inputField.clear();
	        actions.sendKeys("abc123ABC").perform(); // AlphaNumeric
	        if (!inputField.getAttribute("value").matches("[a-zA-Z0-9]+")) {
	            return false;
	        }

	        inputField.clear();
	        actions.sendKeys("abc!@#ABC").perform(); // AlphaSpecial
	        if (!inputField.getAttribute("value").matches("[a-zA-Z!@#$%^]+")) {
	            return false;
	        }

	        inputField.clear();
	        actions.sendKeys("123!@#456").perform(); // NumericSpecial
	        if (!inputField.getAttribute("value").matches("[0-9!@#$%^]+")) {
	            return false;
	        }

	        inputField.clear();
	        actions.sendKeys("abc123!@#ABC").perform(); // AlphaNumericSpecial
	        if (!inputField.getAttribute("value").matches("[a-zA-Z0-9!@#$%^]+")) {
	            return false;
	        }

	        return true;
	    }
	}
	public static void main(String[] args) throws InterruptedException {
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://google.com");

	    WebElement inputField = driver.findElement(By.xpath("//div[@class=\"a4bIc\"]"));
	    InputFieldVerification inputFieldVerification = new launchBrowser().new InputFieldVerification();
	    boolean isValid = inputFieldVerification.verifyAllCombinations(inputField);
	    System.out.println("Are all combinations valid? " + isValid);

	    driver.quit();
	}

}
