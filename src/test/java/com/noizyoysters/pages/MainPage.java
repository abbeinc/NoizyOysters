package com.noizyoysters.pages;

import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public static void goToMainPage (){
        Driver.getDriver().get("https://noizyoysters.com/");
    }

    @FindBy(xpath = "//li[@id='menu-item-274']/a[@href='https://noizyoysters.com/'][.='Home']")
    public WebElement home;

    @FindBy(xpath = "//li[@id='menu-item-273']/a[@href='https://noizyoysters.com/menu/'][.='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//li[@id='menu-item-516']/a[@href='https://noizyoysters.com/drinks-cocktails/'][.='Drinks']")
    public WebElement drinks;

    @FindBy(xpath = "//li[@id='menu-item-644']/a[.='Location']")
    public WebElement location;

    @FindBy(xpath = "//a[@href='https://noizyoysters.com/online-reservation/'][contains(text(),'Reservations')]")
    public WebElement reservations;

    @FindBy(xpath = "//img[@decoding='async'][@src='https://noizyoysters.com/wp-content/uploads/Noizy-Specials-PSD-last-724x1024.jpg']")
    public WebElement imgMenu;

    @FindBy(xpath ="//h3[contains(.,'See our Menu')]")
    public WebElement seeOurMenu;

    @FindBy(xpath = "//h3[contains(.,'Check our Bar')]")
    public WebElement checkOurBar;

    @FindBy(xpath = "//div[@class='elementskit-info-box-title'][contains(.,'Our Location')]")
    public WebElement ourLocation;

    @FindBy(xpath = "//div[@class='insta-follow-btn-area']/a[contains(.,'Follow On Instagram')]")
    public WebElement followOnInstagram;

    @FindBy(xpath = "//div[@class='insta-follow-btn-area']/a[contains(.,'Follow and Subscribe on YouTube')]")
    public WebElement followAndSubscribeOnYouTube;









}
