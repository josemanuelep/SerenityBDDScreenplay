package co.com.choucair.certification.myFirstScreenPlay.tasks;

import co.com.choucair.certification.myFirstScreenPlay.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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
    actor.attemptsTo(Click.on(SearchCoursePage.BTN_UNIVERSIDAD_CH),
            Enter.theValue(course).into(SearchCoursePage.INPUT_SEARCH_BOX),
            Click.on(SearchCoursePage.BTN_GO_SEARCH),
            Click.on(SearchCoursePage.COURSE_SEARCH_TITLE));
    }
}
