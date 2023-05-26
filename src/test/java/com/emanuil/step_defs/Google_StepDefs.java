package com.emanuil.step_defs;

import com.emanuil.utils.BrowserUtils;
import com.emanuil.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_StepDefs {

    @When("user is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
//    String actualTitle = Driver.getDriver().getTitle();
//    String expectedTitle = "Google";
        BrowserUtils.verifyTitle("Google");
    }
}
