package co.com.choucair.certification.myFirstScreenPlay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchCourse implements Task {
    private String course;
    public static SearchCourse searhCourse(String course) {
        return Tasks.instrumented(SearchCourse.class, course);
    }

    public SearchCourse(String course) {
        this.course = course;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
