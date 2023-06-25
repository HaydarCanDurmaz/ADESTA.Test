package StepDefinitanios;

import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;

public class AdestaSteps {
    @Given("Navigate to Adesta")
    public void navigateToAdesta() {
        GWD.getDriver().get("https://www.adesta.de/");
        GWD.getDriver().manage().window().setPosition(new Point(2000,0));
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter the Blog page")
    public void enterTheBlogPage() {
    }

    @Then("User should see blog page")
    public void userShouldSeeBlogPage() {
    }
}
