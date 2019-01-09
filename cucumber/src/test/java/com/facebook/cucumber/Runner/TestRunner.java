package com.facebook.cucumber.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "features",glue= {"com.facebook.cucumber.StepDefination"})
public class TestRunner {

}
