package com.noizyoysters.step_definition;

import com.noizyoysters.pages.LocationPage;
import com.noizyoysters.pages.MainPage;
import com.noizyoysters.pages.ReservationPage;
import com.noizyoysters.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class LocationStepDef {

    MainPage mainPage = new MainPage();
    LocationPage locationPage = new LocationPage();
    ReservationPage reservationPage = new ReservationPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofMillis(5000));
    Actions actions = new Actions(Driver.getDriver());
    @Given("user at the location page")
    public void user_at_the_location_page() {
     MainPage.goToMainPage();
     mainPage.location.click();
    }
    @When("user click Get Direction link")
    public void user_click_get_direction_link() {
       locationPage.getDirection.click();

    }
    @Then("user should see google map page")
    public void user_should_see_google_map_page() {
     String url = "https://www.google.com/maps/place/Noizy+Oysters+Bar";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().startsWith(url));

    }


    @Then("user should see address")
    public void userShouldSeeAddress() {
        String storeAddress = "101 S Kings Hwy, Myrtle Beach, SC 29577";
        String temp = locationPage.address.getText();
        String[] actualArr = temp.split("\n");
        String actual = "";
        for (int i = 0; i < actualArr.length; i++) {

            actual+=actualArr[i]+" ";
        }
        actual = actual.trim();
        Assert.assertEquals(storeAddress, actual);

    }

    @And("phone number")
    public void phoneNumber() {
        String expectedPhone = "(843) 808-9000";
        String actualPhone = locationPage.phoneNumber.getText();

        Assert.assertEquals(expectedPhone, actualPhone);
   }

    @And("store hours")
    public void storeHours() {
    String expectedWeekdayHours = "Monday – Friday: 4:00 PM – 11:00 PM";
    String expectedWeekendHours = "Saturday – Sunday: 3:00 PM – 11:00 PM";

    String tempHours = locationPage.hours.getText();
    String[] tempHoursArr = tempHours.split("\n");
    String actualWeekdayHours = tempHoursArr[0];
    String actualWeekendHours = tempHoursArr[1];

    Assert.assertEquals(expectedWeekdayHours, actualWeekdayHours);
    Assert.assertEquals(expectedWeekendHours, actualWeekendHours);


    }

    @When("user at the location page click ONLINE BOOKING")
    public void userAtTheLocationPageClickONLINEBOOKING() {
        actions.pause(2000).perform();
        js.executeScript("window.scrollBy(0, 2100)");
        wait.until(ExpectedConditions.elementToBeClickable(locationPage.onlineBooking));
        actions.moveToElement(locationPage.onlineBooking).click().perform();

    }

    @Then("user should see reservation page")
    public void userShouldSeeReservationPage()  {
        String expectedTitle = "Online Reservation – Noizy Oysters Bar & Grill";
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        String resrevationPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, resrevationPageTitle);
    }
}
