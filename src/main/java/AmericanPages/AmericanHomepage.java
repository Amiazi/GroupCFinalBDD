package AmericanPages;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmericanHomepage extends WebAPI {
    //driver.findElement(By.xpath)

    @FindBy(partialLinkText = "We're hiring! Join o")
    public WebElement careerLink;
    public AmericanHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //method region

    public void clickOnCareerLink(){
        careerLink.click();
    }

}
