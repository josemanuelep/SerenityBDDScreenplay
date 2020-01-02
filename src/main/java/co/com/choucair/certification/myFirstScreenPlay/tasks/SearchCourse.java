package co.com.choucair.certification.myFirstScreenPlay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchCourse implements Task {
    public static SearchCourse searhCourse(String course) {
        return Tasks.instrumented(SearchCourse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
