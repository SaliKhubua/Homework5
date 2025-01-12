package StepObject;

import PageObject.registrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class registrationPageSteps extends registrationPage {



    @Step ("Open registration page")
    public registrationPageSteps GoToRegPage() {
        signInButton.click();
        createAccountButton.click();

        return this;
    }

    @Step ("Indicate name")
    public registrationPageSteps Name (String name) {
        nameInput.setValue(name);
        nameInput.shouldNot(Condition.empty);
        return this;

    }

    @Step ("Indicate Email")
    public registrationPageSteps Email (String email) {
        emailInput.setValue(email);
        return this;
    }


    @Step("Indicate Password")
    public registrationPageSteps Password (String password) {
        passwordInput.setValue(password);
        return this;
    }


    @Step("Indicate password check")
    public registrationPageSteps PasswordCheck (String passwordcheck)  {
        passwordCheck.setValue(passwordcheck);
        return this;
    }


    @Step("Click on continue")
    public registrationPageSteps ClickOnContinue () {
        continueButton.click();

        return this;

    }


}
