package com.bdd.web.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.bdd.web.glue",
        stepNotifications = true,
        tags = "@CRUD_PETS"
)
public class RunnerTest {

}
