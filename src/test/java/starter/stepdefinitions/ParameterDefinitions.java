package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.rakamin.RegisterRakamin;
import starter.rakamin.object_repository.ObjectRepository;


public class ParameterDefinitions extends PageObject {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    Actor actor = Actor.named("User")
            .whoCan(BrowseTheWeb.with(getDriver()));

    @Before(value="@loginRakamin")
    public void beforeLoginRakamin() {
        actor.wasAbleTo(
                RegisterRakamin.openBrowser(),
                RegisterRakamin.clickRegister(),
                RegisterRakamin.registerForm(),
                WaitUntil.the(ObjectRepository.verifyLater, WebElementStateMatchers.isVisible())
        );
        getDriver().close();
    }
}
