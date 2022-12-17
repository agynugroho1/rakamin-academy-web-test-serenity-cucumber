package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theRakaminHomePage() {
        return Task.where("{0} opens the Rakamin VIX page",
                Open.browserOn().the(RakaminPage.class));
    }

    public static Performable theRakaminVIXPage() {
        return Task.where("{0} opens the Rakamin VIX page",
                Open.browserOn().the(RakaminPage.class));
    }
}
