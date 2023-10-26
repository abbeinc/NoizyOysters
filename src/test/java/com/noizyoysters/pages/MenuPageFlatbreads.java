package com.noizyoysters.pages;

import com.noizyoysters.utility.ConfigReader;
import com.noizyoysters.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPageFlatbreads {

    public MenuPageFlatbreads() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public static void goToMenu(){
        Driver.getDriver().get(ConfigReader.read("noizyOysters_url"));
    }
    @FindBy(xpath = "//h4[.='FLATBREADS']")
    public WebElement flatbreads;

    @FindBy(xpath = "//p/strong[.='Veggie Flatbread']")
    public WebElement veggieFlatbread;

    @FindBy(xpath = "//p/strong[.='Veggie Flatbread']/following-sibling::em")
    public WebElement veggieFlatbreadPrice;

    @FindBy(xpath = "//p/strong[.='BBQ Chicken Flatbread ']")
    public WebElement bBQChickenFlatbread ;

    @FindBy(xpath = "//p/strong[.='BBQ Chicken Flatbread ']/following-sibling::em")
    public WebElement bBQChickenFlatbreadPrice;

    @FindBy(xpath = "//p/strong[.='Grilled Shrimp Scampi Flatbread']")
    public WebElement grilledShrimpScampiFlatbread ;

    @FindBy(xpath = "//p/strong[.='Grilled Shrimp Scampi Flatbread']/following-sibling::em")
    public WebElement grilledShrimpScampiFlatbreadPrice;

    @FindBy(xpath = "//p/strong[.='Margarita Flatbread']")
    public WebElement margaritaFlatbread;

    @FindBy(xpath = "//p/strong[.='Margarita Flatbread']/following-sibling::em")
    public WebElement margaritaFlatbreadPrice;


    @FindBy(xpath = "//p/strong[.='Chicken Caprese Flatbread ']")
    public WebElement chickenCapreseFlatbread;

    @FindBy(xpath = "//p/strong[.='Chicken Caprese Flatbread ']/../following-sibling::p/em")
    public WebElement chickenCapreseFlatbreadPrice;
}
