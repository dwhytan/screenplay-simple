package screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class IrTask {
    public static Performable irAHomePage() {
        return Task.where("{0} ingresa a la página de login",
                Open.browserOn().thePageNamed("login.page")
        );
    }
}
