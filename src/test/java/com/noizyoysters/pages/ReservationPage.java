package com.noizyoysters.pages;

import com.noizyoysters.utility.ConfigReader;
import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPage {
    public ReservationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void goToReservationPage(){
        Driver.getDriver().get((ConfigReader.read("noizyOysters_url"))+"online-reservation/");
    }
    @FindBy(xpath = "//span[@class='wpcf7-form-control-wrap']/input[@name='your-name']")
    public WebElement name;

    @FindBy(xpath = "//span[@data-name='your-email']/input[@name='your-email']")
    public WebElement email;

    @FindBy(xpath = "//span[@data-name='your-phone']/input[@name='your-phone']")
    public WebElement phone;

    @FindBy(xpath = "//span[@data-name='your-seats']/select")
    public WebElement howManyPeople;

    @FindBy(xpath = "//span[@data-name='your-date']/input")
    public WebElement dateTime;

    @FindBy(xpath = "//div[@class='xdsoft_time '][2]")
    public WebElement choosingDateTime;

    @FindBy(xpath = "//input[@value='SUBMIT YOUR RESERVATION']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[.='Please fill out this field.']/span")
    public WebElement noNameWarning;

    @FindBy(xpath = "//span[.='Please fill out this field.'][@data-name='your-email']/span")
    public WebElement noEmailWarning;

    @FindBy(xpath = "//span[.='Please fill out this field.'][@data-name='your-phone']/span")
    public WebElement noPhoneWarning;





}
