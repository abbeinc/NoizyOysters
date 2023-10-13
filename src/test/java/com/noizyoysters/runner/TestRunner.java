package com.noizyoysters.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features =    "src/test/resources/features" //"classpath:features"
                ,glue = "com/noizyoysters/step_definition"
                ,publish = true//
                ,plugin = {"pretty",  "html:target/cucumber.html" //
                            , "rerun:target/rerun.txt"//
                            }
                            ,dryRun = false


               // ,tags="@single"
        ,tags="@regression"
              //,tags="@@smoke"
                // ,tags="@@smoke"
               // ,tags = "@calculator"
            )

public class TestRunner {

}
