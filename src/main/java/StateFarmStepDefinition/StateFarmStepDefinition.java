package StateFarmStepDefinition;

import StateFarmPage.StateFarmHomepage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class StateFarmStepDefinition extends WebAPI {

    @Before
    public void openBrowser() throws IOException {
        setUp(false,
                "browserstack",
                "windows", "11",
                "chrome",
                "111",
                "https://www.statefarm.com/");

    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    static StateFarmHomepage homepage;

    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, StateFarmHomepage.class);
    }

    @Given("I am on StateFarm homepage")
    public void i_am_on_StateFarm_homepage() {
        getInitElements();
    }

    @When("I click on Banking link")
    public void i_click_on_Banking_link() throws InterruptedException {
        Thread.sleep(3000);
        homepage.clickBanking();
    }

    @When("I click on Payment Solutions")
    public void i_click_on_Payment_Solutions() {
        homepage.clickPaymentSolutions();
    }
    @When("I click on Find Solutions")
    public void i_click_on_Find_Solutions() {
        homepage.clickFindSolutions();
    }
    @When("I click on Continue As Guest")
    public void i_click_on_Continue_As_Guest() {
        homepage.clickContinueAsGuest();
    }
    @Then("I will land on US Bank page")
    public void i_will_land_on_US_Bank_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://onboarding.usbank.com/talech/statefarm/acq/te/industry?transactionId="));
    }


    @Given("I am on the StateFarm homepage")
    public void i_am_on_the_StateFarm_homepage() {
        getInitElements();
    }
    @When("I click on Find An Agent")
    public void i_click_on_Find_An_Agent() {homepage.clickFindAgent();}
    @When("I type in the zipcode")
    public void i_type_in_the_zipcode() {
        homepage.EnterZipCode("10459");
    }
    @When("I click on Find an agent search button")
    public void i_click_on_Find_an_agent_search_button() {
        homepage.clickOnSearchAgentBttn();
    }
    @Then("I get the search results")
    public void i_get_the_search_results() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.statefarm.com/agent/?zipCode=10459");
    }
    @Given("I am on the StateFarm home page")
    public void i_am_on_the_StateFarm_home_page() {
        getInitElements();
    }
    @When("I click on insurance")
    public void i_click_on_insurance() {
        homepage.clickInsuranceOp();
    }
    @When("click on Life button")
    public void click_on_Life_button() {
        homepage.clickLifeBttn();
    }
    @When("click on NY")
    public void click_on_NY() {
        homepage.SelectState("NY");
    }
    @When("click on go button")
    public void click_on_go_button() {
        homepage.clickGoForLifeInsurance();
    }
    @Then("I get the NY results")
    public void i_get_the_NY_results() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlToBe("https://life.statefarm.com/LifeQuoteCustomer-web/getStarted"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://life.statefarm.com/LifeQuoteCustomer-web/getStarted");
    }

    @When("I click on help")
    public void i_click_on_help() {
        homepage.clickOnHelpButton();
    }
    @Then("I land on page with help options")
    public void o_land_on_page_with_help_options() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.statefarm.com/");
    }
    @When("I click on Track a claim")
    public void i_click_on_Track_a_claim() {
        homepage.clickTrackClaim();
    }
    @When("I click start chat")
    public void i_click_start_chat() {
        homepage.clickStartChat();
    }
    @When("I click cancel")
    public void i_click_cancel() {
        homepage.clickCancel();
    }
    @When("I click the yes button")
    public void i_click_the_yes_button() {
        homepage.clickYes();
    }
    @Then("I land back on claim tracking page")
    public void i_land_back_on_claim_tracking_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.statefarm.com/claims/check-existing-claim");
    }





}


