package StateFarmStepDefinition;

import StateFarmPageObjects.ContactUsPage;
import StateFarmPageObjects.CustomerCarePage;
import StateFarmPageObjects.StateFarmHomepage;
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
}
