package com.noizyoysters.pages;

import com.noizyoysters.utility.ConfigReader;
import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPageSidesAndSoups {


    public MenuPageSidesAndSoups() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void goToMenu(){
        Driver.getDriver().get((ConfigReader.read("noizyOysters_url"))+"menu/");
    }


    @FindBy(xpath = "//h4[.='SIDES and SOUPS']")
    public WebElement sidesAndSoups;


    @FindBy(xpath = "//div[@class=\"elementor-widget-container\"]//strong[.='House Seasoned French Fries']")
    public WebElement houseSeasonedFrenchFries;


    @FindBy(xpath = "//div[@class=\"elementor-widget-container\"]//strong[.='Corn on a Cob ']")
    public WebElement cornOnaCob;


    @FindBy(xpath = "//div[@class=\"elementor-widget-container\"]//strong[.='Roasted Broccoli ']")
    public WebElement roastedBroccoli ;

    @FindBy(xpath = "//div[@class=\"elementor-widget-container\"]//strong[.='Baked Potato ']")
    public WebElement bakedPotato ;

    @FindBy(xpath = "//div[@class=\"elementor-widget-container\"]//strong[.='Rice Pilaf ']")
    public WebElement ricePilaf;


    @FindBy(xpath = "//div[@class='elementor-widget-container']//strong[.='Clam and Chowder Soup']")
    public WebElement clamAndChowderSoup;

    @FindBy(xpath = "//div[@class='elementor-widget-container']//strong[.='Soup fo the Day ']")
    public WebElement soupfoTheDay ;



}
