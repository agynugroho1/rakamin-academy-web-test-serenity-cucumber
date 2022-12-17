package starter.rakamin.object_repository;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjectRepository {

    public static String name = "";
    public static String email = "";
    public static String password = "";

    public static Target loginMenu = Target.the("login button").located(By.xpath("//*[@data-cy=\"login-page-button\"]"));
    public static Target fillEmail = Target.the("fill email").located(By.xpath("//*[@data-cy=\"login-email-text-field\"]"));

    public static Target fillPassword = Target.the("fill password").located(By.xpath("//*[@data-cy=\"login-password-text-field\"]"));

    public static Target submitLogin = Target.the("submit login").located(By.xpath("//*[@data-cy=\"login-submit-button\"]"));

    public static Target searchVIX = Target.the("search vix").located(By.xpath("//*[@data-cy=\"vix-card-1\"]"));

    public static Target registerMenu = Target.the("register button menu").located(By.xpath("//*[@data-cy=\"login-page-button\"]//ancestor::div[1]/button[contains(text(),\"Register\")]"));

    public static Target fillNameRegister = Target.the("fill name register").located(By.xpath("//*[@name=\"name\" and @type=\"text\"]"));

    public static Target fillEmailRegister = Target.the("fill email register").located(By.xpath("//*[@name=\"email\" and @type=\"text\"]"));

    public static Target fillPasswordRegister = Target.the("fill password register").located(By.xpath("//*[@name=\"password\" and @type=\"password\"]"));

    public static Target submitRegister = Target.the("submit daftar").located(By.xpath("//*[@data-cy=\"login-submit-button\"]"));

    public static Target verifyLater = Target.the("verify later").located(By.xpath("//a[contains(text(), \"later\") or contains(text(), \"Later\")]"));

    public static Target btnDaftarSekarang = Target.the("daftar sekarang").located(By.xpath("//*[@data-cy=\"register-vix-button\"]"));

    public static Target fillFullName = Target.the("fill full name").located(By.xpath("//*[@data-cy=\"full-name-text-field\"]"));

    public static Target fillWhastapp = Target.the("fill whatsapp").located(By.xpath("//*[@data-cy=\"phone-number-text-field\"]"));

    public static Target fillLinkedin = Target.the("fill linked in").located(By.xpath("//*[@data-cy=\"linkedin-url-text-field\"]"));

    public static Target uploadCV = Target.the("upload cv").located(By.xpath("//*[@type=\"file\"]"));

    public static Target cbxVIX = Target.the("checkbox vix").located(By.xpath("//*[@data-cy=\"vix-info-source-option-1\"]"));

    public static Target cbxAgreement = Target.the("checkbox agreement").located(By.xpath("//*[@data-cy=\"agreement-checkbox\"]"));

    public static Target submitFormDaftar = Target.the("submit daftar sekarang").located(By.xpath("//*[@data-cy=\"vix-form-submit-button\"]"));

    public static Target modalConfirmation  = Target.the("modal confirmation").located(By.xpath("//*[@data-cy=\"confirmation-modal-title\"]"));

    public static Target btnConfirmationDaftar  = Target.the("button confirmation").located(By.xpath("//*[@data-cy=\"button-confirm\"]"));

    public static Target lblCheckoutPage = Target.the("button confirmation").located(By.xpath("//*[@data-cy=\"checkout-course-name\"]"));

    public static Target cbxVIP  = Target.the("checkbox VIP").located(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[2]/div[2]"));

    public static Target btnCheckout  = Target.the("button checkout").located(By.xpath("//*[@data-cy=\"continue-to-payment-button\"]"));

    public static Target lblPaymentPage  = Target.the("button checkout").locatedBy("#payment-methods");

}
