package com.noizyoysters.pages;

import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrinksMenuPage {
    public DrinksMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public static void goToDrinksMenuPage(){
        Driver.getDriver().get("https://noizyoysters.com/drinks-cocktails/");
    }

    @FindBy(xpath = "//p/strong[.='Oyster Shooter']")
    public WebElement oysterShooter;

    @FindBy(xpath = "//p/strong[.='Oyster Shooter']/../em")
    public WebElement oysterShooterPrice;

    @FindBy(xpath = "//p/strong[.='Noizy Margarita']")
    public WebElement noizyMargarita;
    @FindBy(xpath = "//p/strong[.='Noizy Margarita']/../em")
    public WebElement noizyMargaritaPrice;

    @FindBy(xpath = "//p/strong[.='Paloma']")
    public WebElement paloma;
    @FindBy(xpath = "//p/strong[.='Paloma']/../em")
    public WebElement palomaPrice;

    @FindBy(xpath = "//p/strong[.='Martini']")
    public WebElement martini;
    @FindBy(xpath = "//p/strong[.='Martini']/../em")
    public WebElement martiniPrice;
    @FindBy(xpath = "//p/strong[.='Mimosa']")
    public WebElement mimosa;
    @FindBy(xpath = "//p/strong[.='Mimosa']/../em")
    public WebElement mimosaPrice;

    @FindBy(xpath = "//p/strong[.='Moscow Mule']")
    public WebElement moscowMule;
    @FindBy(xpath = "//p/strong[.='Moscow Mule']/../em")
    public WebElement moscowMulePrice;
    @FindBy(xpath = "//p/strong[.='Bloody Mary']")
    public WebElement bloodyMary;
    @FindBy(xpath = "//p/strong[.='Bloody Mary']/../em")
    public WebElement bloodyMaryPrice;

    @FindBy(xpath = "//p/strong[.='Aperol Spritz']")
    public WebElement aperolSpritz;
    @FindBy(xpath = "//p/strong[.='Aperol Spritz']/../em")
    public WebElement aperolSpritzPrice;

    @FindBy(xpath = "//p/strong[.='Seabreeze']")
    public WebElement seabreeze;
    @FindBy(xpath = "//p/strong[.='Seabreeze']/../em")
    public WebElement seabreezePrice;
    @FindBy(xpath = "//p/strong[.='Fresh Strawberry Margarita']")
    public WebElement freshStrawberryMargarita;
    @FindBy(xpath = "//p/strong[.='Fresh Strawberry Margarita']/../em")
    public WebElement freshStrawberryMargaritaPrice;



    @FindBy(xpath = "//p/strong[.='Pineapple Margarita']")
    public WebElement pineappleMargarita;
    @FindBy(xpath = "//p/strong[.='Pineapple Margarita']/../em")
    public WebElement pineappleMargaritaPrice;

    @FindBy(xpath = "//p/strong[.='Hibiscus Margarita']")
    public WebElement hibiscusMargarita;
    @FindBy(xpath = "//p/strong[.='Hibiscus Margarita']/../em")
    public WebElement hibiscusMargaritaPrice;

    @FindBy(xpath = "//p/strong[.='Appletini']")
    public WebElement appletini;

    @FindBy(xpath = "//p/strong[.='Appletini']/../em")
    public WebElement appletiniPrice;

    @FindBy(xpath = "//p/strong[.='Mojito']")
    public WebElement mojito;
    @FindBy(xpath = "//p/strong[.='Mojito']/../em")
    public WebElement mojitoPrice;

    @FindBy(xpath = "//p/strong[.='Long Island Iced Tea ']")
    public WebElement longIslandIcedTea;

    @FindBy(xpath = "//p/strong[.='Long Island Iced Tea ']/../em")
    public WebElement longIslandIcedTeaPrice;

    @FindBy(xpath = "//p/strong[.='Cosmopolitan']")
    public WebElement cosmopolitan;
    @FindBy(xpath = "//p/strong[.='Cosmopolitan']/../em")
    public WebElement cosmopolitanPrice;
    @FindBy(xpath = "//p/strong[.='Noizy Sweet Tea Vodka ']")
    public WebElement noizySweetTeaVodka;
    @FindBy(xpath = "//p/strong[.='Noizy Sweet Tea Vodka ']/../em")
    public WebElement noizySweetTeaVodkaPrice;

    @FindBy(xpath = "//p/strong[.='Pina Colada']")
    public WebElement pinaColada;
    @FindBy(xpath = "//p/strong[.='Pina Colada']/../em")
    public WebElement pinaColadaPrice;



}

