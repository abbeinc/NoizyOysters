package com.noizyoysters.step_definition;

import com.noizyoysters.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {


@Before("@regression")

public void setupDriver(){
    System.out.println("THIS IS FROM @Before inside hooks class");
    // set up implicit wait
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    Driver.getDriver().manage().window().maximize();
    }
@After("@regression") //it comes from import io.cucumber.java.After; (Make sure it is correct import)
public void tearDown(Scenario scenario){
    // check if scenario failed or not
    if(scenario.isFailed()){
        // this is how we take screenshot in selenium
        TakesScreenshot ts = (TakesScreenshot)Driver.getDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Attached img");


    }




    System.out.println("THIS IS FROM @After inside hooks class");
    Driver.closeBrowser();

}


}
