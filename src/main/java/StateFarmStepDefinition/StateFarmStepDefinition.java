package StateFarmStepDefinition;

import HomeDepotHomePage.HomeDepotHomepage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StateFarmStepDefinition extends WebAPI {

        @Before
        public void openBrowser() throws IOException {
            setUp(  false,
                    "browserstack",
                    "windows", "11",
                    "chrome",
                    "111",
                    "https://www.HomeDepot.com/");
        }
        @After
        public void closeBrowser(){
            cleanUp();
        }
        static HomeDepotHomepage homepage;
        public static void getInitElements(){homepage= PageFactory.initElements(driver,HomeDepotHomepage.class);}
        @Given("I am on Home Depot homepage")
        public void i_am_on_Home_Depot_homepage() {
           getInitElements();
        }

        @When("I type a product in the search bar")
        public void i_type_a_product_in_the_search_bar() {
           getInitElements();
           homepage.doSearch("table");
        }
        @When("I click on the search icon")
        public void i_click_on_the_search_icon() {
           getInitElements();
           homepage.clickOnSearchButton();
        }

        @Then("I get the search results")
        public void i_get_the_search_results() {
           getInitElements();
           driver.getTitle();
        }

    }
