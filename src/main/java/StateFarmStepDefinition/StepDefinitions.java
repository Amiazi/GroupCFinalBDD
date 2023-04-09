package StateFarmStepDefinition;

import StateFarmPageObjects.*;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions extends WebAPI {
    private final StateFarmHomepage homepage;
    private ContactUsPage contactUsPage;
    private CustomerCarePage customerCarePage;
    private SearchResultsPage searchResultsPage;
    private CalculatorsPage calculatorsPage;

    public StepDefinitions() {
        setUp();
        homepage = new StateFarmHomepage(getDriver());
    }

    @After
    public void tearDown() {cleanUp();}

    @Given("I am on StateFarm homepage")
    public void iAmOnStateFarmHomepage() {
        String currentUrl = homepage.getUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase("https://www.statefarm.com/"));
    }

    @When("I scroll to the bottom of the page")
    public void iScrollToTheBottomOfThePage() {
        homepage.scrollToFindContactUsLink();
    }

    @And("clicks the contact us link")
    public void clicksTheContactUpLink() {
        contactUsPage = homepage.clickContactUsLink();
    }

    @Then("I should be taken to the contact us page")
    public void iShouldBeTakenToTheContactUsPage() {
        String currentUrl = contactUsPage.getCurrentUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase("https://www.statefarm.com/customer-care/contact-us"));
    }

    @And("The business tel number as {string}")
    public void theBusinessTelNumberAs(String expectedBusinessTel) {
        String displayedBusinessPhone = contactUsPage.getCreditCardInquiriesUSBankBusinessPhoneNumber();
        Assert.assertTrue(displayedBusinessPhone.equalsIgnoreCase(expectedBusinessTel));
    }

    @Then("In the Credit card inquiries - U.S. Bank section I should see the consumer tel as {string}")
    public void inTheCreditCardInquiriesUSBankSectionIShouldSeeTheConsumerTelAs(String expectedConsumerTel) {
        String displayedConsumerPhone = contactUsPage.getCreditCardInquiriesUSBankConsumerPhoneNumber();
        Assert.assertTrue(displayedConsumerPhone.equalsIgnoreCase(expectedConsumerTel));
    }

    @When("I click on the help button")
    public void iClickOnTheHelpButton() {
        customerCarePage = homepage.clickHelpButton();
    }

    @Then("I should be taken to the customer care page")
    public void iShouldBeTakenToTheCustomerCarePage() {
        String currentUrl = customerCarePage.getCurrentUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase("https://www.statefarm.com/customer-care"));
    }

    @When("I click on the epsanol button")
    public void iClickOnTheEpsanolButton() {
        homepage.clickEspanonLink();
    }

    @Then("I should see the website language changed to spanish by checking the {string}")
    public void iShouldSeeTheWebsiteLanguageChangedToSpanishByCheckingThe(String expectedHeading) {
        String displayedHeading = homepage.getHeadingOfThePage();
        Assert.assertTrue(displayedHeading.equalsIgnoreCase(expectedHeading));
    }

    @When("I click on the search link")
    public void iClickOnTheSearchLink() {
        homepage.clickSearchButton();
    }

    @And("I enter {string} to search and click the search button")
    public void iEnterToSearchAndClickTheSearchButton(String searchContent) {
        searchResultsPage = homepage.search(searchContent);
    }

    @Then("I should be taken to the search result page")
    public void iShouldBeTakenToTheSearchResultPage() {
        String currentUrl = searchResultsPage.getCurrentUrl();
        Assert.assertTrue(currentUrl.startsWith("https://www.statefarm.com/sfsearch"));
    }

    @And("There I can verify that more than one search result for the keyword is shown")
    public void thereICanVerifyThatMoreThanOneSearchResultForTheKeywordIsShown() {
        boolean isSearchResultDisplayed = searchResultsPage.isSearchResultsDisplayed();
        Assert.assertTrue(isSearchResultDisplayed);
    }

    @When("I scroll to the discover more articles sections")
    public void iScrollToTheDiscoverMoreArticlesSections() {
        homepage.scrollToCarouselView();
    }

    @And("clicks the next button until the calculator card is being displayed and clicks the card")
    public void clicksTheNextButtonUntilTheCalculatorCardIsBeingDisplayedAndClicksTheCard() {
        calculatorsPage = homepage.clickCalculatorCarouselCard();
    }

    @Then("I should be taken to the calculator page whose url should be as {string}")
    public void iShouldBeTakenToTheCalculatorPageWhoseUrlShouldBeAs(String expectedPageUrl) {
        String currentUrl = calculatorsPage.getPageUrl();
        Assert.assertTrue(currentUrl.equalsIgnoreCase(expectedPageUrl));
    }
}
