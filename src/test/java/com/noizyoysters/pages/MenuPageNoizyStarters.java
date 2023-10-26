package com.noizyoysters.pages;

import com.noizyoysters.utility.ConfigReader;
import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPageNoizyStarters {

    public MenuPageNoizyStarters() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void goToMenu(){
        Driver.getDriver().get((ConfigReader.read("noizyOysters_url"))+"menu/");
    }

    @FindBy(xpath = "//img[@decoding='async'][contains(@src, 'Noizy-Oysters-logo.png' )]")
    public WebElement firstPic;

    @FindBy(xpath = "//h4[.='NOIZY STARTERS']")
    public WebElement noizyStarters;

    @FindBy(xpath = "//p/strong[.='Shrimp Cocktail']")
    public WebElement shrimpCoctail;

    @FindBy(xpath = "//p/strong[.='Shrimp Cocktail']/following-sibling::em")
    public WebElement shrimpCoctailPrice;


    @FindBy(xpath = "//p/strong[.='Golden Fried Calamari']")
    public WebElement goldenFriedCalamari;

    @FindBy(xpath = "//p/strong[.='Golden Fried Calamari']/following-sibling::em")
    public WebElement goldenFriedCalamariPrice;

    @FindBy(xpath = "//p/strong[.='Ahi Tuna']")
    public WebElement ahiTuna;

    @FindBy(xpath = "//p/strong[.='Ahi Tuna']/following-sibling::em")
    public WebElement ahiTunaPrice;

    @FindBy(xpath = "//p/strong[.='Crab Nachos']")
    public WebElement crabNachos;

    @FindBy(xpath = "//p/strong[.='Crab Nachos']/following-sibling::em")
    public WebElement crabNachosPrice;

    @FindBy(xpath = "//p/strong[.='Butterfly Shrimp']")
    public WebElement butterflyShrimp;

    @FindBy(xpath = "//p/strong[.='Butterfly Shrimp']/following-sibling::em")
    public WebElement  butterflyShrimpPrice;

    @FindBy(xpath = "//p/strong[.='Noizy Crab Cakes']")
    public WebElement noizyCrabCakes;

    @FindBy(xpath = "//p/strong[.='Noizy Crab Cakes']/following-sibling::em")
    public WebElement  noizyCrabCakesPrice;

}
