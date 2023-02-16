package screenplay.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import screenplay.user_interfaces.OrangeHRMLoginPage;

public class OrangeHRMQuestion {
    public static Question<Boolean> dashboard() {
        return Visibility.of(OrangeHRMLoginPage.DASHBOARD).asBoolean();
    }
}
