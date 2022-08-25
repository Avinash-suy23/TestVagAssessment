package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbWebpage {

	public ImdbWebpage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="suggestion-search")
	public WebElement searchbox_movie;
	
	@FindBy(id="iconContext-magnify")
	public WebElement button_submit;
	
	@FindBy(xpath="//a[@href='/title/tt9389998/?ref_=fn_al_tt_1']")
	public WebElement link_pushaMovie;
	@FindBy(xpath="//a[text()='January 7, 2022 (United States)']")
	public WebElement releasedate_pushaMovie;
	
	@FindBy(xpath="//a[text()='India']")
	public WebElement country_pushaMovie;
	
}
