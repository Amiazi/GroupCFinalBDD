package HomeDepotHomePage;

import common.WebAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmericanHomepage extends WebAPI {
    //driver.findElement(By.xpath)

@FindBy(id = "headerSearch") public WebElement inputSearch;
@FindBy(id = "headerSearchButton") public WebElement searchButton;
@FindBy(xpath = "//div[@class='MyStore__store']") public WebElement locationDropDown;
@FindBy(xpath = "//span[text()='Find Other Stores']") public WebElement findStoreButton;
@FindBy(xpath = "//div[@id='myStore-list']//button") public List<WebElement> listStoreButton;
    public AmericanHomepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //method region
    public void doSearch(String searchTerm){type(inputSearch,searchTerm);
    }
    public void clickOnSearchButton(){
        click(searchButton);
    }
    public void clickOnLocationDropDown(){
        click(locationDropDown);
    }
    public void clickOnFindStoreButton(){
        click(findStoreButton);
    }
    public void clickOnSelectStore(int index){
       click(listStoreButton.get(index));
    }
    public String getMyStoreName(){
        return getTextFromWebElement(locationDropDown);
    }
}
