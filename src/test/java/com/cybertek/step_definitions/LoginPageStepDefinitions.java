package com.cybertek.step_definitions;

import cucumber.api.java.en.When;

public class LoginPageStepDefinitions {


    @When("I enter my email {string} and {string}")
    public void i_enter_my_email_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
        System.out.println(string2);

    }
}