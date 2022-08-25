package testvagrant.Web_automation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libreries.BaseClass;
import pages.ImdbWebpage;
import pages.WikiWebpage;

public class CompareDatenCountryForPushpa extends BaseClass {
	public ImdbWebpage imdb;
	public WikiWebpage wiki;
	
	
	@BeforeMethod
	public void init() {
		initialization();
		 imdb =new ImdbWebpage(driver);
		 wiki =new WikiWebpage(driver);
		
		}
	
	@Test
	public void releaseDatePushpa() {
		
		imdb.searchbox_movie.sendKeys("Pushpa: The Rise - Part 1");
		imdb.button_submit.click();
		imdb.link_pushaMovie.click();
		String imdbreleaseDate = imdb.releasedate_pushaMovie.getText();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/India");
		wiki.searchbox_movie.sendKeys("Pushpa: The Rise - Part 1");
		wiki.button_submit.click();
		String wikireleasedate = wiki.releasedate_pushaMovie.getText();
		
		Assert.assertEquals(imdbreleaseDate, wikireleasedate);
		}
	
	@Test
	public void originCountryOfPushpa() {
		//ImdbWebpage imdb =new ImdbWebpage(driver);
		//WikiWebpage wiki =new WikiWebpage(driver);
		imdb.searchbox_movie.sendKeys("Pushpa: The Rise - Part 1");
		imdb.button_submit.click();
		imdb.link_pushaMovie.click();
		String imdbOrignCountry = imdb.country_pushaMovie.getText();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/India");
		wiki.searchbox_movie.sendKeys("Pushpa: The Rise - Part 1");
		wiki.button_submit.click();
		String wikiOrignCountry = wiki.country_pushaMovie.getText();
		
		Assert.assertEquals(imdbOrignCountry,wikiOrignCountry );
	
		}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	

}
