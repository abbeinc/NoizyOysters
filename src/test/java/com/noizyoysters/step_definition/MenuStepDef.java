package com.noizyoysters.step_definition;

import com.noizyoysters.pages.MenuPageFlatbreads;
import com.noizyoysters.pages.MenuPageNoizyStarters;
import com.noizyoysters.pages.MenuPageSidesAndSoups;
import com.noizyoysters.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class MenuStepDef {
MenuPageNoizyStarters menuPage = new MenuPageNoizyStarters();
MenuPageFlatbreads menuPageFlatbreads = new MenuPageFlatbreads();
MenuPageSidesAndSoups menuPageSidesAndSoups = new MenuPageSidesAndSoups();
JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));

    @Given("user at the menu page")
    public void user_at_the_menu_page() {
        MenuPageNoizyStarters.goToMenu();

    }
    @When("user scroll down")
    public void user_scroll_down() {
        Assert.assertEquals("NOIZY STARTERS", menuPage.noizyStarters.getText());
    }
    @Then("menu Noizy Starters has following")
    public void menu_noizy_starters_has_following(Map<String, String> mp) {
    Map<String,String> actualMap = new HashMap<>();
    String shrimpCoctailPrice = menuPage.shrimpCoctailPrice.getText();
    shrimpCoctailPrice = shrimpCoctailPrice.substring(shrimpCoctailPrice.indexOf("$"));
    String goldenFriedCalamariPrice = menuPage.goldenFriedCalamariPrice.getText();
    goldenFriedCalamariPrice = goldenFriedCalamariPrice.substring(goldenFriedCalamariPrice.indexOf("$"));
    String ahiTunaPrice = menuPage.ahiTunaPrice.getText();
    ahiTunaPrice = ahiTunaPrice.substring(ahiTunaPrice.indexOf("$"));
    String crabNachosPrice = menuPage.crabNachosPrice.getText();
    crabNachosPrice = crabNachosPrice.substring(crabNachosPrice.indexOf("$"));
    String butterflyShrimpPrice = menuPage.butterflyShrimpPrice.getText();
    butterflyShrimpPrice = butterflyShrimpPrice.substring(butterflyShrimpPrice.indexOf("$"));
    String noizyCragCakesPrice = menuPage.noizyCrabCakesPrice.getText();
    noizyCragCakesPrice = noizyCragCakesPrice.substring(noizyCragCakesPrice.indexOf("$"));
    actualMap.put(menuPage.shrimpCoctail.getText(), shrimpCoctailPrice);
    actualMap.put(menuPage.goldenFriedCalamari.getText(), goldenFriedCalamariPrice);
    actualMap.put(menuPage.ahiTuna.getText(), ahiTunaPrice);
    actualMap.put(menuPage.crabNachos.getText(), crabNachosPrice);
    actualMap.put(menuPage.butterflyShrimp.getText(), butterflyShrimpPrice);
    actualMap.put(menuPage.noizyCrabCakes.getText(), noizyCragCakesPrice);

    Assert.assertEquals(mp, actualMap);


    }


    @When("user see section Flatbreads")
    public void userSeeSectionFlatbreads() {

        js.executeScript("window.scrollBy(0,1200)");
        wait.until(ExpectedConditions.visibilityOfAllElements(menuPageFlatbreads.veggieFlatbread));
        Assert.assertEquals("FLATBREADS", menuPageFlatbreads.flatbreads.getText());

    }


    @Then("menu Flatbreads contains following")
    public void menuFlatbreadsContainsFollowing(Map<String,String> mp) {

    Map<String, String> actualMap = new HashMap<>();

    String veggieFlatbreadPrice = menuPageFlatbreads.veggieFlatbreadPrice.getText();
    veggieFlatbreadPrice = veggieFlatbreadPrice.substring(veggieFlatbreadPrice.indexOf("$"));
    String bbqChickenFlatbreadPrice = menuPageFlatbreads.bBQChickenFlatbreadPrice.getText();
    bbqChickenFlatbreadPrice = bbqChickenFlatbreadPrice.substring(bbqChickenFlatbreadPrice.indexOf("$"));
    String grilledShrimpScampiFlatbreadPrice = menuPageFlatbreads.grilledShrimpScampiFlatbreadPrice.getText();
    grilledShrimpScampiFlatbreadPrice = grilledShrimpScampiFlatbreadPrice.substring(grilledShrimpScampiFlatbreadPrice.indexOf("$"));
    String margaritaFlatbreadPrice = menuPageFlatbreads.margaritaFlatbreadPrice.getText();
    margaritaFlatbreadPrice = margaritaFlatbreadPrice.substring(margaritaFlatbreadPrice.indexOf("$"));
    String chickenCapreseFlatbreadPrice = menuPageFlatbreads.chickenCapreseFlatbreadPrice.getText();
    chickenCapreseFlatbreadPrice=chickenCapreseFlatbreadPrice.substring(chickenCapreseFlatbreadPrice.indexOf("$"));

actualMap.put(menuPageFlatbreads.veggieFlatbread.getText(), veggieFlatbreadPrice);
actualMap.put(menuPageFlatbreads.bBQChickenFlatbread.getText(), bbqChickenFlatbreadPrice);
actualMap.put(menuPageFlatbreads.grilledShrimpScampiFlatbread.getText(), grilledShrimpScampiFlatbreadPrice);
actualMap.put(menuPageFlatbreads.margaritaFlatbread.getText(), margaritaFlatbreadPrice);
actualMap.put(menuPageFlatbreads.chickenCapreseFlatbread.getText(),chickenCapreseFlatbreadPrice );

    Assert.assertEquals(mp, actualMap);


    }

    @When("user see Sides and Soup menu")
    public void userSeeSidesAndSoupMenu() throws InterruptedException {

        js.executeScript("window.scrollBy(0,3000)");



    }

    @Then("menu contain items and prices")
    public void menuContainItemsAndPrices() {
        Assert.assertTrue(menuPageSidesAndSoups.sidesAndSoups.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.houseSeasonedFrenchFries.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.cornOnaCob.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.roastedBroccoli.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.bakedPotato.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.ricePilaf.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.clamAndChowderSoup.isDisplayed());
        Assert.assertTrue(menuPageSidesAndSoups.soupfoTheDay.isDisplayed());



    }
}
