package starter.rakamin;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.rakamin.object_repository.ObjectRepository;

public class LoginRakamin {

    public static Performable clickLogin() {
        return Task.where("{0} click Login button",
                Click.on(ObjectRepository.loginMenu)
        );
    }

    public static Performable fillFormLogin() {
        return Task.where("{0} fill form login",
                Enter.theValue(ObjectRepository.email)
                        .into(ObjectRepository.fillEmail),
                Enter.theValue(ObjectRepository.password)
                        .into(ObjectRepository.fillPassword),
                Click.on(ObjectRepository.submitLogin)
        );
    }
}
