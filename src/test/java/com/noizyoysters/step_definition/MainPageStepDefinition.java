package com.noizyoysters.step_definition;
import com.noizyoysters.pages.MainPage;
import com.noizyoysters.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainPageStepDefinition {

MainPage mainPage = new MainPage();
JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofMillis(5000));

    @Given("user at the main page")
    public void user_at_the_main_page() {
    MainPage.goToMainPage();
        Assert.assertEquals("Noizy Oysters Bar & Grill – Seafood restaurant", Driver.getDriver().getTitle());
        Assert.assertEquals("https://noizyoysters.com/", Driver.getDriver().getCurrentUrl());
    }
    @When("user click Home button")
    public void user_click_home_button() {
        mainPage.home.click();

    }
    @Then("title of the page must be Noizy Oysters Bar & Grill – Seafood restaurant")
    public void title_of_the_page_must_be_noizy_oysters_bar_grill_seafood_restaurant() {
        Assert.assertEquals("Noizy Oysters Bar & Grill – Seafood restaurant",Driver.getDriver().getTitle());
    }

    @When("user click MENU button")
    public void userClickMENUButton() {
        mainPage.menu.click();
    }

    @Then("user must see the page menu")
    public void userMustSeePageMenu() {
        Assert.assertEquals("Menu – Noizy Oysters Bar & Grill", Driver.getDriver().getTitle());
        Assert.assertEquals("https://noizyoysters.com/menu/", Driver.getDriver().getCurrentUrl());

    }

    @When("user click DRINKS button")
    public void userClickDRINKSButton() {

        mainPage.drinks.click();
    }

    @Then("user must see the page drinks")
    public void userMustSeeThePageDrinks() {
        Assert.assertEquals("Bar Menu – Noizy Oysters Bar & Grill", Driver.getDriver().getTitle());
        Assert.assertEquals("https://noizyoysters.com/drinks-cocktails/", Driver.getDriver().getCurrentUrl());
    }

    @When("user click LOCATION button")
    public void userClickLOCATIONButton() {
        mainPage.location.click();
    }

    @Then("user must see the page location")
    public void userMustSeeThePageLocation() {
        Assert.assertEquals("Location – Noizy Oysters Bar & Grill", Driver.getDriver().getTitle());
    }

    @When("user click RESERVATIONS button")
    public void userClickRESERVATIONSButton() {
        mainPage.reservations.click();

    }

    @Then("user must see the page reservations")
    public void userMustSeeThePageReservations() {
        Assert.assertEquals("Online Reservation – Noizy Oysters Bar & Grill", Driver.getDriver().getTitle());
    }


    @When("user goes down on the main page")
    public void userGoesDownOnTheMainPage() {

        js.executeScript("window.scrollBy(0,1200)");

    }

    @Then("user must see menu img")
    public void userMustSeeMenuImg() {
        Assert.assertTrue(mainPage.imgMenu.isDisplayed());
    }

    @When("user scroll main page down")
    public void userScrollMainPageDown()  {

        js.executeScript("window.scrollBy(0,2200)");
    }

    @Then("user must see three links")
    public void userMustSeeThreeLinks(List<String> lst) {
        List<String> actual = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOf(mainPage.ourLocation));
        actual.add(mainPage.seeOurMenu.getText().trim());
        actual.add(mainPage.checkOurBar.getText().trim());
        actual.add(mainPage.ourLocation.getText().trim());
        Assert.assertEquals(lst, actual);

    }

    @When("user click on Follow on Instagram button")
    public void userClickOnFollowOnInstagramButton() {

        js.executeScript("window,scrollBy(0,4500)");
        wait.until(ExpectedConditions.visibilityOf(mainPage.followOnInstagram));
        actions.moveToElement(mainPage.followOnInstagram).click().perform();
    }

    @Then("user should see Instagram page")
    public void userShouldSeeInstagramPage() {
        String instagramTitle = "Noizy Oysters | Myrtle Beach, South Carolina | Instagram photos and videos";
        Set<String> windHandls = Driver.getDriver().getWindowHandles();
        for (String each : windHandls) {
            if(Driver.getDriver().switchTo().window(each).getTitle().equals(instagramTitle)){
                Assert.assertEquals(instagramTitle, Driver.getDriver().getTitle());
            }



        }




    }

    @When("user click on Follow and Subscribe on YouTube")
    public void userClickOnFollowAndSubscribeOnYouTube() {
        js.executeScript("window,scrollBy(0,4700)");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOf(mainPage.followAndSubscribeOnYouTube));
        actions.moveToElement(mainPage.followAndSubscribeOnYouTube).click().perform();

    }

    @Then("user should see YouTube page")
    public void userShouldSeeYouTubePage() {
        String youTubeTitle = "Noizy Oysters - YouTube";
        Set<String> st = Driver.getDriver().getWindowHandles();
        for (String eachHandle : st) {

            if(Driver.getDriver().switchTo().window(eachHandle).getTitle().equals(youTubeTitle)){
                Assert.assertEquals(youTubeTitle, Driver.getDriver().getTitle());
            }
        }


    }
}
