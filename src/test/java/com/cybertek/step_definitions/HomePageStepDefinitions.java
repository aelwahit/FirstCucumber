package com.cybertek.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("I am going to login page");

    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("I am logging in");

    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("I can see the home page");

    }
    @And("title should be correct")
    public void title_should_be_correct() {

        System.out.println("Title should be correct");
    }

    @Then("hasta etme adami")
    public void hasta_etme_adami() {
        System.out.println(2+5);
    }

    @Then("title dogru olsa nolcak")
    public void title_dogru_olsa_nolcak() {
        System.out.println(6/2);
    }

    @Given("usn the login page")
    public void usn_the_login_page() {

    }

    @When("us logs in as a team lead")
    public void us_logs_in_as_a_team_lead() {

    }

    @Then("epage should be displayed")
    public void epage_should_be_displayed() {

    }

    @Then("le should be corre")
    public void le_should_be_corre() {

    }




}
