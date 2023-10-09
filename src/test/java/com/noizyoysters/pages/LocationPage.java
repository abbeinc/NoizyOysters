package com.noizyoysters.pages;

import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage {

    public LocationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='https://goo.gl/maps/APexoapKCDaHoPrf6']")
    public WebElement getDirection;

    @FindBy(xpath ="//div[@class='elementor-widget-container'][contains(.,'101 S Kings Hwy,')]" )
    public WebElement address;

    @FindBy(xpath = "//a[@href='tel:8438089000']/strong")
    public WebElement phoneNumber;

    @FindBy(xpath = "//p/strong[.='Monday – Friday:']")
    public WebElement weekdays;

    @FindBy(xpath = "//p/strong[.='Saturday – Sunday:']")
    public WebElement weekend;

    @FindBy(xpath = "//p/strong[.='Monday – Friday:']/..")
    public WebElement hours;

    @FindBy(xpath = "//div[@class=\"elementor-widget-container\"]//a[@href=\"https://noizyoysters.com/online-reservation/\"][contains(.,'Online Booking')]")
    public WebElement onlineBooking;

}
