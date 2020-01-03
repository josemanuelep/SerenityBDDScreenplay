package co.com.choucair.certification.myFirstScreenPlay.stepsdefinitions;

import co.com.choucair.certification.myFirstScreenPlay.questions.Answer;
import co.com.choucair.certification.myFirstScreenPlay.tasks.Login;
import co.com.choucair.certification.myFirstScreenPlay.tasks.OpenUp;
import co.com.choucair.certification.myFirstScreenPlay.tasks.SearchCourse;
import com.sun.scenario.effect.impl.prism.ps.PPSOneSamplerPeer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AcademyChoucairStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to learn automation at the academy choucair$")
    public void than_Brandon_wants_to_learn_automation_at_the_academy_choucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),
                (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platfrom$")
    public void he_search_for_teh_course_Recursos_Automatización_Bancolombia_on_the_choucair_academy_platfrom(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCourse.searhCourse(course));
    }

    @Then("^he finds the course called (.*)$")
    public void he_finds_the_course_calle_resourses_Automatización_Bancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
