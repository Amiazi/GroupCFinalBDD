package StateFarmPageObjects;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactUsPage extends WebAPI {
    private WebDriver driver;

    @FindBy(xpath = "//div[contains(p,'Credit card inquiries - U.S. Bank')]/../../div[contains(div, 'Consumer')]")
    private List<WebElement> creditCardInquiriesSectionPhoneNumbersDiv;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getCreditCardInquiriesUSBankConsumerPhoneNumber() {
        WebElement phoneNumberSection = creditCardInquiriesSectionPhoneNumbersDiv.get(0);
        return phoneNumberSection.findElements(By.tagName("a")).get(0).getText();
    }
    public String getCreditCardInquiriesUSBankBusinessPhoneNumber() {
        WebElement phoneNumberSection = creditCardInquiriesSectionPhoneNumbersDiv.get(0);
        return phoneNumberSection.findElements(By.tagName("a")).get(1).getText();
    }
}
