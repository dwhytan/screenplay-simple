package screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeHRMLoginPage {
    public static Target TXT_USERNAME = Target.the("LOGIN - USUARIO")
            .locatedBy("//input[@name='username']");

    public static Target TXT_PASSWORD = Target.the("LOGIN - CONTRASEÑA")
            .locatedBy("//input[@name='password']");

    public static Target BTN_LOGIN = Target.the("LOGIN - ACCEDER")
            .locatedBy("//button[@type='submit']");
    
    public static Target DASHBOARD = Target.the("DASHBOARD")
            .locatedBy("//img[@src='/web/images/orangehrm-logo.png?1672659722816']");
}
