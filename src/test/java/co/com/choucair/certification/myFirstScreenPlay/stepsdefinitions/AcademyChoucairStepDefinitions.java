package co.com.choucair.certification.myFirstScreenPlay.stepsdefinitions;

import co.com.choucair.certification.myFirstScreenPlay.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AcademyChoucairStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Brandon wants to learn automation at the academy choucair$")
    public void than_Brandon_wants_to_learn_automation_at_the_academy_choucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for teh course Recursos Automatización Bancolombia on the choucair academy platfrom$")
    public void he_search_for_teh_course_Recursos_Automatización_Bancolombia_on_the_choucair_academy_platfrom()  {

    }

    @Then("^he finds the course calle resourses Automatización Bancolombia$")
    public void he_finds_the_course_calle_resourses_Automatización_Bancolombia() {

    }

}
