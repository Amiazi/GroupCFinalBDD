package StateFarmPage;

import common.WebAPI;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmHomepage extends WebAPI {
    @FindBy(xpath = "//button[@data-for='banking']")
    public WebElement BankingBttn;
    @FindBy(xpath = "//section[@id='oneX-submenu-banking']//a[contains(@class,'-oneX-link--block menuLevel2')][normalize-space()='Payment Solutions']")
    public WebElement PaymentSolutions;
    @FindBy(xpath = "//a[contains(text(),'Find a solution with U.S. Bank')]")
    public WebElement FindSolution;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[5]/a[1]/button[1]")
    public WebElement ContinueAsGuest;


    @FindBy(xpath = "//span[text()='Help']")
    public WebElement SFHelpButton;
    @FindBy(xpath = "//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[8]/div/button/span")
    public WebElement FindAnAgent;
    @FindBy(id = "findAnAgentButton")
    public WebElement findAgentBttn;
    @FindBy(xpath = "//input[@id='oneX-findAnAgentZipCode']")
    public WebElement ZipCodInputField;
    @FindBy(xpath = "//button[@id='findAnAgentButton']")
    public WebElement FindAnAgentSearch;

    @FindBy(css = "button[data-for='insurance']")
    public WebElement InsuranceBttn;
    @FindBy(xpath = "//a[@id='oneX-3-insurance']")
    public WebElement LifeBttn;
    @FindBy(xpath = "//select[@id='quote-main-state-select']")
    public WebElement StateDropDwn;
    @FindBy(xpath = "//button[@data-name='state']")
    public WebElement GoForQuoteBttn;

    @FindBy(linkText = "Track a claim")
    public WebElement TrackClaim;
    @FindBy(xpath = "//span[contains(text(),'Chat')]")
    public WebElement Chat;
    @FindBy(xpath = "//img[@src='/image/close.svg']")
    public WebElement CancelBttn;
    @FindBy(xpath = "div[id='herculesChatElDiv'] span:nth-child(1)")
    public WebElement YesBttn;



    public StateFarmHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickBanking() {
        BankingBttn.click();
    }
    public void clickPaymentSolutions() {
        PaymentSolutions.click();
    }
    public void clickFindSolutions() {
        //FindSolution.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", FindSolution);
//        try {
//            FindSolution.click();
//        } catch (ElementClickInterceptedException ex) {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", FindSolution);
//        }
    }
    public void clickContinueAsGuest(){ContinueAsGuest.click();}
    public void clickOnHelpButton () {SFHelpButton.click();}
    public void clickFindAgent () {FindAnAgent.click();}
    public void EnterZipCode (String ZipCode){ZipCodInputField.sendKeys(ZipCode);}
    public void clickOnSearchAgentBttn () {findAgentBttn.click();}

    public void clickInsuranceOp () {InsuranceBttn.click();}
    public void clickLifeBttn () {LifeBttn.click();}
    public void SelectState (String state){
        selectFromDropdown(StateDropDwn, state);
    }
    public void clickGoForLifeInsurance () {
        try {
            GoForQuoteBttn.click();
        } catch (ElementClickInterceptedException ex) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", GoForQuoteBttn);
        }
    }

    public void clickTrackClaim () {TrackClaim.click();}
    public void clickStartChat () {Chat.click();}
    public void clickCancel () {CancelBttn.click();}
    public void clickYes () {YesBttn.click();}


}



