package co.com.choucair.certification.myFirstScreenPlay.questions;

import co.com.choucair.certification.myFirstScreenPlay.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String nameOfCourse = Text.of(SearchCoursePage.COURSE_MAIN_TITLE).viewedBy(actor).asString();
        boolean result;
        if (question.equals(nameOfCourse)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
