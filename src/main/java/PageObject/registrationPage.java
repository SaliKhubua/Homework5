package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class registrationPage {
    public SelenideElement


    nameInput = $(byId("ap_customer_name")),
    emailInput = $(byId("ap_email")),
    passwordInput = $(byId("ap_password")),
    passwordCheck = $(byId("ap_password_check")),
    continueButton = $(byId("continue")),
    signInButton = $(byId("nav-link-accountList-nav-line-1")),
    createAccountButton = $(byId("createAccountSubmit"));



}
