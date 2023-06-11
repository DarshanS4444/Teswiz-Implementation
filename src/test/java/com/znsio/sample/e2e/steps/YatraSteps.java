package com.znsio.sample.e2e.steps;

import com.context.SessionContext;
import com.context.TestExecutionContext;
import com.znsio.sample.e2e.businessLayer.calculator.CalculatorBL;
import com.znsio.sample.e2e.entities.SAMPLE_TEST_CONTEXT;
import com.znsio.teswiz.entities.Platform;
import com.znsio.teswiz.runner.Drivers;
import com.znsio.teswiz.runner.Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.znsio.teswiz.tools.Wait.waitFor;

public class YatraSteps {
    private static final Logger LOGGER = Logger.getLogger(YatraSteps.class.getName());
    private final TestExecutionContext context;

    public YatraSteps() {
        context = SessionContext.getTestExecutionContext(Thread.currentThread().getId());
        LOGGER.info("context: " + context.getTestName());
    }

    @Given("I, as guest user, search for a {string} trip with source {string} and destination {string} for first trip")
    public void iAsGuestUserSearchForATripWithSourceAndDestinationForFirstTrip(String arg0, String arg1, String arg2) {
    }

    @And("I select flight from source {string} and destination {string} for second trip")
    public void iSelectFlightFromSourceAndDestinationForSecondTrip(String arg0, String arg1) {
    }

    @When("I add {int} adults, {int} children and {int} infant passengers")
    public void iAddAdultsChildrenAndInfantPassengers(int arg0, int arg1, int arg2) {
    }

    @Then("I choose {string} class category {string} flight")
    public void iChooseClassCategoryFlight(String arg0, String arg1) {
    }
}
