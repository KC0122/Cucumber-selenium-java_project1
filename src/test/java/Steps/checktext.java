package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;


public class checktext {

    WebDriver driver;

    @Given("I Launch the browser")
    public void launchbrowser() {
        driver = new ChromeDriver();
    }

    @When("I provide the URL for Home page of orangecrm.com")
    public void gotoHomepage() {
        driver.get("https://www.orangecrm.com/");
    }

    @Then("Home page is loaded and checks if the text  - Orange CRM - exists or not")
    public void checkIfDisplayed() {
        var y="ORANGE CRM";
        var x=driver.findElement(By.cssSelector("h1.wow.fadeInDownBig.animated")).getText();
        System.out.println(x);
        assertEquals(x,y);
    }

    @And("Close browser")
    public void closeBrowser() {
        driver.quit();
    }
}
