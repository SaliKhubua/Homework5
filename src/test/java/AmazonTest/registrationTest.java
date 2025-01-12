package AmazonTest;

import StepObject.registrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.registrationPageData.*;

public class registrationTest extends ChromeRunner {
    registrationPageSteps registrationPageSteps = new registrationPageSteps();


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description ("Testing if all the information is filled up and submit button works")
    public void amazonregtest () {
        registrationPageSteps
                .GoToRegPage()
                .Name(firstName)
                .Email(email)
                .Password(password)
                .PasswordCheck(reenterPassword)
                .ClickOnContinue();

        Assert.assertFalse(registrationPageSteps.createAccountButton.is(Condition.visible));

    }
}
