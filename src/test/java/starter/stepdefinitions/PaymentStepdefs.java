package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Displayed;
import starter.rakamin.LoginRakamin;
import starter.rakamin.VIXDetailRakamin;
import starter.rakamin.object_repository.ObjectRepository;

import java.util.ArrayList;


public class PaymentStepdefs {
    @Given("{actor} navigates to the VIX detail page")
    public void userNavigatesToTheVIXDetailPage(Actor actor) {
        actor.wasAbleTo(
                Open.url("https://web-staging.rakamin.com/virtual-internship-experience/explore"),
                LoginRakamin.clickLogin(),
                LoginRakamin.fillFormLogin()
        );

        boolean verifyLaterIsDisplayed = actor.asksFor(
                Displayed.of(ObjectRepository.verifyLater)
        );

        if(verifyLaterIsDisplayed){
            actor.wasAbleTo(
                    Click.on(ObjectRepository.verifyLater)
            );
        }

        Serenity.getDriver().get("https://web-staging.rakamin.com/virtual-internship-experience/explore");

        actor.attemptsTo(
                VIXDetailRakamin.clickVIX()
        );

    }

    @When("{actor} click “Daftar Sekarang”")
    public void userClickDaftarSekarang(Actor actor) {
        actor.attemptsTo(
                VIXDetailRakamin.clickDaftarSekarang()
        );
    }

    @And("{actor} fill form application")
    public void userFillFormApplication(Actor actor) {
        actor.attemptsTo(
                VIXDetailRakamin.fillFormDaftarSekarang()
        );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("{actor} confirmed to continue")
    public void userConfirmedToContinue(Actor actor) {
        actor.attemptsTo(
            VIXDetailRakamin.clickConfirmationDaftar()
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("{actor} checkout")
    public void userChooseVIPAccess(Actor actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                VIXDetailRakamin.clickCheckOut()
        );
    }

    @Then("{actor} redirect to payment page")
    public void theSystemRedirectToPaymentPage(Actor actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Serenity.getDriver().close();
    }
}
