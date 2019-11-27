package com.aimprosoft.steps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.aimprosoft.steps.serenity.EndUserSteps;


public class StepsToBuy {

    @Steps
    EndUserSteps anna;

    @Given("the user is on the Rozetka home page")
    public void givenTheUserIsOnTheRozetkaHomePage() {
        anna.is_the_home_page();
    }

    @When("^the user enters in search field '(.*)'")
    public void theUserEntersInSearchFieldIphone(String word)  {
        anna.looks_for(word);
    }

    @When("^the user click on result iphone xs")
    public void theUserClickOnResultIphoneXs()  {
        anna.click_on_result();
    }

    @When("^the user choose gray iphone xs$")
    public void theUserChooseGrayIphoneXs() {anna.chooseIphoneXS();

    }

    @When("^the user choose silver color iphone xs$")
    public void theUserChooseSilverColorIphoneXs() {anna.choose_color();

    }

    @When("^the user choose gray color of iphone xs$")
    public void theUserChooseGrayColorOfIphoneXs() {anna.choose_color_gray();
    }

    @When("^the user add gray iphone to basket$")
    public void theUserAddGrayIphoneToBasket() {anna.add_phone();
    }

    @Then("^check that button '(.*)' is available")
    public void checkThatButtonКупитьIsAvailable(String word) {
        anna.searchBy(word);
    }




}

