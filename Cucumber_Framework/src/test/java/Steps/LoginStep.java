import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep{
	
WebDriver driver;

@Given("user should navigate to the application")
public void user_should_navigate_to_the_application() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com");
}

@Given("user should click on login link")
public void user_should_click_on_login_link() {
   driver.findElement(By.xpath("//a[text()='Logi in']")).click();
}

@Given("user enter the username as Charles@gmail.com")
public void user_enter_the_username_as_Charles_gmail_com() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("user enter the password as {int}")
public void user_enter_the_password_as(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("user click the login button")
public void user_click_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("login should be success")
public void login_should_be_success() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}