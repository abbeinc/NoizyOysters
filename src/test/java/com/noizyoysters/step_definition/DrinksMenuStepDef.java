package com.noizyoysters.step_definition;

import com.noizyoysters.pages.DrinksMenuPage;
import com.noizyoysters.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DrinksMenuStepDef {
    DrinksMenuPage drinksMenuPage = new DrinksMenuPage();

    @Given("user at the drinks menu page")
    public void user_at_the_drinks_menu_page() {
        DrinksMenuPage.goToDrinksMenuPage();
        Assert.assertEquals("Bar Menu – Noizy Oysters Bar & Grill", Driver.getDriver().getTitle());
    }
    @When("user scroll down to the Noizy Favorites")
    public void user_scroll_down_to_the_noizy_favorites() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)");
    }
    @Then("user should see")
    public void user_should_see(Map<String, String> mp) {

        String oysterShooterPrice = drinksMenuPage.oysterShooterPrice.getText();
        oysterShooterPrice=oysterShooterPrice.substring(oysterShooterPrice.indexOf("$"));
        String noizyMargaritaPrice = drinksMenuPage.noizyMargaritaPrice.getText();
        noizyMargaritaPrice=noizyMargaritaPrice.substring(noizyMargaritaPrice.indexOf("$"));
        String palomaPrice = drinksMenuPage.palomaPrice.getText();
        palomaPrice=palomaPrice.substring(palomaPrice.indexOf("$"));
        String martiniPrice = drinksMenuPage.martiniPrice.getText();
        martiniPrice=martiniPrice.substring(martiniPrice.indexOf("$"));
        String mimosaPrice = drinksMenuPage.mimosaPrice.getText();
        mimosaPrice = mimosaPrice.substring(mimosaPrice.indexOf("$"));
        String moscowMulePrice = drinksMenuPage.moscowMulePrice.getText();
        moscowMulePrice = moscowMulePrice.substring(moscowMulePrice.indexOf("$"));
        String bloodyMaryPrice = drinksMenuPage.bloodyMaryPrice.getText();
        bloodyMaryPrice = bloodyMaryPrice.substring(bloodyMaryPrice.indexOf("$"));
        String aperolSpritzPrice = drinksMenuPage.aperolSpritzPrice.getText();
        aperolSpritzPrice = aperolSpritzPrice.substring(aperolSpritzPrice.indexOf("$"));
        String seabreezePrice = drinksMenuPage.seabreezePrice.getText();
        seabreezePrice = seabreezePrice.substring(seabreezePrice.indexOf("$"));
        String freshStrawberryMargaritaPrice = drinksMenuPage.freshStrawberryMargaritaPrice.getText();
        freshStrawberryMargaritaPrice = freshStrawberryMargaritaPrice.substring(freshStrawberryMargaritaPrice.indexOf("$"));
        String pineappleMargaritaPrice = drinksMenuPage.pineappleMargaritaPrice.getText();
        pineappleMargaritaPrice = pineappleMargaritaPrice.substring(pineappleMargaritaPrice.indexOf("$"));
        String hibiscusMargaritaPrice = drinksMenuPage.hibiscusMargaritaPrice.getText();
        hibiscusMargaritaPrice = hibiscusMargaritaPrice.substring(hibiscusMargaritaPrice.indexOf("$"));
        String appletiniPrice = drinksMenuPage.appletiniPrice.getText();
        appletiniPrice = appletiniPrice.substring(appletiniPrice.indexOf("$"));
        String mojitoPrice = drinksMenuPage.mojitoPrice.getText();
        mojitoPrice = mojitoPrice.substring(mojitoPrice.indexOf("$"));
        String longIslandIcedTeaPrice = drinksMenuPage.longIslandIcedTeaPrice.getText();
        longIslandIcedTeaPrice = longIslandIcedTeaPrice.substring(longIslandIcedTeaPrice.indexOf("$"));
        String cosmopolitanPrice = drinksMenuPage.cosmopolitanPrice.getText();
        cosmopolitanPrice = cosmopolitanPrice.substring(cosmopolitanPrice.indexOf("$"));
        String noizySweetTeaVodkaPrice = drinksMenuPage.noizySweetTeaVodkaPrice.getText();
        noizySweetTeaVodkaPrice = noizySweetTeaVodkaPrice.substring(noizySweetTeaVodkaPrice.indexOf("$"));
        String pinaColadaPrice = drinksMenuPage.pinaColadaPrice.getText();
        pinaColadaPrice = pinaColadaPrice.substring(pinaColadaPrice.indexOf("$"));

        Map<String,String> actualMp = new LinkedHashMap<>();
    actualMp.put(drinksMenuPage.oysterShooter.getText(), oysterShooterPrice);
    actualMp.put(drinksMenuPage.noizyMargarita.getText(), noizyMargaritaPrice);
    actualMp.put(drinksMenuPage.paloma.getText(), palomaPrice);
    actualMp.put(drinksMenuPage.martini.getText(), martiniPrice);
    actualMp.put(drinksMenuPage.mimosa.getText(), mimosaPrice);
    actualMp.put(drinksMenuPage.moscowMule.getText(), moscowMulePrice);
    actualMp.put(drinksMenuPage.bloodyMary.getText(), bloodyMaryPrice);
    actualMp.put(drinksMenuPage.aperolSpritz.getText(), aperolSpritzPrice);
    actualMp.put(drinksMenuPage.seabreeze.getText(), seabreezePrice);
    actualMp.put(drinksMenuPage.freshStrawberryMargarita.getText(), freshStrawberryMargaritaPrice);
    actualMp.put(drinksMenuPage.pineappleMargarita.getText(), pineappleMargaritaPrice);
    actualMp.put(drinksMenuPage.hibiscusMargarita.getText(), hibiscusMargaritaPrice);
    actualMp.put(drinksMenuPage.appletini.getText(), appletiniPrice);
    actualMp.put(drinksMenuPage.mojito.getText(), mojitoPrice);
    actualMp.put(drinksMenuPage.longIslandIcedTea.getText(), mojitoPrice);
    actualMp.put(drinksMenuPage.longIslandIcedTea.getText(), longIslandIcedTeaPrice);
    actualMp.put(drinksMenuPage.cosmopolitan.getText(), cosmopolitanPrice);
    actualMp.put(drinksMenuPage.noizySweetTeaVodka.getText(), noizySweetTeaVodkaPrice);
    actualMp.put(drinksMenuPage.pinaColada.getText(), pinaColadaPrice);

    Assert.assertEquals(mp, actualMp);


    }

}
