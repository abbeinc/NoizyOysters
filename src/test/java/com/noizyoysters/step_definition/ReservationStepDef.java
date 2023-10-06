package com.noizyoysters.step_definition;

import com.github.javafaker.Faker;
import com.noizyoysters.pages.ReservationPage;
import com.noizyoysters.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReservationStepDef {
    ReservationPage reservationPage = new ReservationPage();
    Faker faker = new Faker();
    String quantity;
    @Given("user at the online-reservation page")
    public void user_at_the_online_reservation_page() {
       ReservationPage.goToReservationPage();
        Assert.assertEquals("Online Reservation – Noizy Oysters Bar & Grill", Driver.getDriver().getTitle());
    }
    @When("user enter information in all fields and click submit button")
    public void user_enter_information_in_all_fields_and_click_submit_button() throws InterruptedException {
        reservationPage.name.sendKeys(faker.name().fullName());
        reservationPage.email.sendKeys(faker.animal().name()+"@gmail.com");
        reservationPage.phone.sendKeys(faker.phoneNumber().cellPhone());
        Select select = new Select(reservationPage.howManyPeople);
        select.selectByVisibleText("12");
        reservationPage.dateTime.click();
        reservationPage.choosingDateTime.click();

        Thread.sleep(5000);
    }
    @Then("user will see reservation approved page")
    public void user_will_see_reservation_approved_page() {

    }

    @When("user enters all information except name")
    public void userEntersAllInformationExceptName() {
        reservationPage.email.sendKeys(faker.animal().name()+"@gmail.com");
        reservationPage.phone.sendKeys(faker.phoneNumber().cellPhone());
        Select select = new Select(reservationPage.howManyPeople);
        select.selectByVisibleText("12");
        reservationPage.dateTime.click();
        reservationPage.choosingDateTime.click();


    }

    @Then("user should see warning sign for name")
    public void userShouldSeeWarningSignForName() {
        Assert.assertTrue(reservationPage.noNameWarning.isDisplayed());


    }

    @When("user enter all information except email")
    public void userEnterAllInformationExceptEmail() {
        reservationPage.name.sendKeys(faker.name().fullName());
        reservationPage.phone.sendKeys(faker.phoneNumber().cellPhone());
        Select select = new Select(reservationPage.howManyPeople);
        select.selectByVisibleText("12");
        Assert.assertEquals("12", select.getFirstSelectedOption().getText());
        reservationPage.dateTime.click();
        reservationPage.choosingDateTime.click();

    }

    @Then("user should see warning sign for email")
    public void userShouldSeeWarningSignForEmail() {
        Assert.assertTrue(reservationPage.noEmailWarning.isDisplayed());
    }

    @When("user enter all information except phone")
    public void userEnterAllInformationExceptPhone() {
        reservationPage.name.sendKeys(faker.name().fullName());
        reservationPage.email.sendKeys(faker.animal().name()+"@gmail.com");
        reservationPage.phone.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).pause(Duration.ofMillis(2000)).perform();

        Select select = new Select(reservationPage.howManyPeople);
        select.selectByVisibleText("2");
        Assert.assertEquals("2", select.getFirstSelectedOption().getText());
        reservationPage.dateTime.click();
        reservationPage.choosingDateTime.click();
        reservationPage.submitButton.click();


    }

    @Then("user should see warning sing for phone")
    public void userShouldSeeWarningSingForPhone() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMillis(4000));
        wait.until(ExpectedConditions.visibilityOf(reservationPage.noNameWarning));
        Assert.assertEquals("Please fill out this field.", reservationPage.noPhoneWarning.getText());

    }

    @When("user enter all information and choose {string} of people")
    public void userEnterAllInformationAndChooseOfPeople(String amount) {
        reservationPage.name.sendKeys(faker.name().fullName());
        reservationPage.email.sendKeys(faker.animal().name()+"@gmail.com");
        reservationPage.phone.sendKeys(faker.phoneNumber().cellPhone());
        Select select = new Select(reservationPage.howManyPeople);
        select.selectByVisibleText(amount);
        reservationPage.dateTime.click();
        reservationPage.choosingDateTime.click();
        quantity = select.getFirstSelectedOption().getText();

    }



    @Then("user should see correct quantity on the screen")
    public void userShouldSeeCorrectQuantityOnTheScreen() {
        Assert.assertEquals(quantity, reservationPage.howManyPeople.getAttribute("value"));
    }


}
