package starter.rakamin;

import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.rakamin.object_repository.ObjectRepository;

import java.nio.file.Path;
import java.nio.file.Paths;

public class VIXDetailRakamin {
    public static Performable clickVIX() {
        return Task.where("{0} click detail vix",
                Click.on(ObjectRepository.searchVIX)
        );
    }

    public static Performable clickDaftarSekarang() {
        return Task.where("{0} click daftar sekarang",
                Ensure.that(ObjectRepository.btnDaftarSekarang).isDisplayed(),
                Click.on(ObjectRepository.btnDaftarSekarang)
        );
    }

    public static Performable fillFormDaftarSekarang() {
        Path file = Paths.get(System.getProperty("user.dir") + "/src/test/resources/file/CV_Agy Nugroho_QA.pdf");
        return Task.where("{0} click daftar sekarang",
                Enter.theValue(ObjectRepository.name)
                        .into(ObjectRepository.fillFullName),
                Enter.theValue("081234567891")
                        .into(ObjectRepository.fillWhastapp),
                Enter.theValue("https://www.linkedin.com/in/agynugroho-200999/")
                        .into(ObjectRepository.fillLinkedin),
                Upload.theFile(file).to(ObjectRepository.uploadCV),
                Click.on(ObjectRepository.cbxVIX),
                Click.on(ObjectRepository.cbxAgreement),
                Click.on(ObjectRepository.submitFormDaftar)
        );
    }

    public static Performable clickConfirmationDaftar() {
        return Task.where("{0} click confirm daftar",
                JavaScriptClick.on(ObjectRepository.btnConfirmationDaftar)
        );
    }

    public static Performable clickCheckOut() {
        return Task.where("{0} click checkout",
                JavaScriptClick.on(ObjectRepository.btnCheckout)
        );
    }

    public static Performable validatePaymentPage() {
        return Task.where("{0} validate payment page",
                Ensure.that(ObjectRepository.lblPaymentPage).isDisplayed()
        );
    }
}
