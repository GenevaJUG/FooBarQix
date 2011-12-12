package com.github.genevajug.foo.bar.qix.features;

import com.github.genevajug.foo.bar.qix.converter.NumberConverter;
import cucumber.annotation.Before;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class TestApplication {

    private NumberConverter numberConverter;
    private String result;
    
    @Before
    public void before() {
        result = null;
        numberConverter = new NumberConverter();
    }
    
    @When("^I have a division by (\\d+)$")
    public void iHaveADivisionBy(int divisionBy) {
        result = numberConverter.convert(divisionBy);
    }


    @Then("^the result should contain (.+)$")
    public void theResultShouldContain(String resultShouldContain) {
        System.out.println("Result should contain " + resultShouldContain);
        Assert.assertTrue(result.contains(resultShouldContain));
    }

    
    @When("^the number contains (\\d+)$")
    public void theNumberContains(int number){
        System.out.println("Number test " + number );
        result = numberConverter.convert(number);
    }

    @When("^the number is (\\d+)$")
    public void theNumberIs(int number){
        System.out.println("Number is " + number );
        result = numberConverter.convert(number);
    }


    @Then("^the result should be (.+)$")
    public void theResultShouldBe(String expected) {
        assertEquals(expected, result);
    }

}
