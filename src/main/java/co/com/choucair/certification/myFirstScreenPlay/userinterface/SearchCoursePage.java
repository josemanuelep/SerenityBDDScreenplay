package co.com.choucair.certification.myFirstScreenPlay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    private static final Target BTN_UNIVERSIDAD_CH = Target.the("Click to go to the searh panel").located(By.xpath("(//STRONG)[1]"));
    private static final Target INPUT_SEARCH_BOX = Target.the("Input to type the course to search").located(By.id("coursesearchbox"));
    private static final Target BTN_GO_SEARCH = Target.the("Click to searh").located(By.xpath("//BUTTON[@class='btn btn-secondary'][text()='Ir']"));
    private static final Target COURSE_MAIN_TITLE = Target.the("Visible main text if the course exists").located(By.xpath("(//H4[text()='Recursos Automatización Bancolombia'])[1]"));

}
