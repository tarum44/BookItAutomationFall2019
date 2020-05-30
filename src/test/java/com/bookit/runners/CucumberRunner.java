package com.bookit.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue="/com/bookit/step_definitions",
        features = "/BookItAutomationFall2019/src/test/resources/features",
        plugin={
                "json:target/cucumber.json"
        },
        tags="@api",
        dryRun = true
)

public class CucumberRunner {
}
