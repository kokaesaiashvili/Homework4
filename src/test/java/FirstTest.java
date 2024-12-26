import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class FirstTest {

    @Test
    public void myFirsttest() {
        open("https://www.facebook.com/");
        $(byText("Create new account")).click();
        $(byName("firstname")).setValue("Koka");
        $(byName("lastname")).setValue("Esaiashvili");
        $("#month").selectOption("May");
        $("#day").selectOption("4");
        $("#year").selectOption("1995");
        $(byText("Custom")).click();
        $(byName("preferred_pronoun")).selectOption("He: \"Wish him a happy birthday!\"");
        $(byText("Male")).click();
        sleep(5000);

    }
}
