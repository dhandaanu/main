package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="" , 
      features={"src/test/resources/features" },
      glue= {"stepdefinitions"},
      monochrome=true,
      plugin= {"pretty" , "html:target/htmlreport.html",
    		  //"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
                            }

		)
public class DsTestRunner {

}
