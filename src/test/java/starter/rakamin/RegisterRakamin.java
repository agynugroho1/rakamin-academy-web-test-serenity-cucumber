package starter.rakamin;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.navigation.RakaminPage;
import starter.rakamin.object_repository.ObjectRepository;

public class RegisterRakamin {

    public static Performable openBrowser(){
        return Task.where("open browser",
                Open.browserOn().the(RakaminPage.class)
        );
    }

    public static Performable clickRegister() {
        return Task.where("{0} click register menu",
                Click.on(ObjectRepository.registerMenu)
        );
    }

    public static Performable registerForm(){
        return Task.where("{0} fill name",
                Enter.theValue((ObjectRepository.name = "Agy"+System.currentTimeMillis()))
                        .into(ObjectRepository.fillNameRegister),
                Enter.theValue((ObjectRepository.email="Agy"+System.currentTimeMillis()+"@test.com"))
                        .into(ObjectRepository.fillEmailRegister),
                Enter.theValue((ObjectRepository.password="rp100perak"))
                        .into(ObjectRepository.fillPasswordRegister),
                WaitUntil.the(ObjectRepository.submitRegister, WebElementStateMatchers.isEnabled()),
                Click.on(ObjectRepository.submitRegister)
        );
    }
}
