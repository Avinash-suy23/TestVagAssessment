package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiWebpage {
	public WikiWebpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="searchInput")
	public WebElement searchbox_movie;
	
	@FindBy(id="searchButton")
	public WebElement button_submit;
	
	@FindBy(xpath="(//div[@class='plainlist'])[4]//child::li")
	public WebElement releasedate_pushaMovie;
	
	@FindBy(xpath="//td[text()='India']")
	public WebElement country_pushaMovie;

}
