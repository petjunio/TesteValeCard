import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.get("https://www.amazon.com.br");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("email@email.com"); //Insira o email
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("senha"); //Insira a senha
		driver.findElement(By.id("signInSubmit")).click();
	}
}