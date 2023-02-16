package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import screenplay.questions.OrangeHRMQuestion;
import screenplay.tasks.IniciarSesionTask;
import screenplay.tasks.IrTask;

public class orangeLoginSD {
    @Dado("que {actor} ingresa a Orange HRM")
    public void A(Actor actor) {
        actor.attemptsTo(IrTask.irAHomePage());
    }

    @Cuando("el ingrese sus credenciales")
    public void B() {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.enOrangeHRM());
    }

    @Entonces("deberá autenticarse correctamente y visualizar el homepage")
    public void C() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OrangeHRMQuestion.dashboard(), Matchers.is(true)));
    }
}
