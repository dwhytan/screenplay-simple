package screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.user_interfaces.OrangeHRMLoginPage;

public class IniciarSesionTask {

    public static Performable enOrangeHRM() {
        return Task.where("{0} llena sus datos e inicia sesión en Salesforce",
                Enter.theValue("Admin").into(OrangeHRMLoginPage.TXT_USERNAME),
                Enter.theValue("admin123").into(OrangeHRMLoginPage.TXT_PASSWORD),
                Click.on(OrangeHRMLoginPage.BTN_LOGIN)
        );
    }


}
