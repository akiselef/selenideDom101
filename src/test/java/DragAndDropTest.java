import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
//        $("#column-a").dragAndDropTo($("#column-b"));
//        $("#column-b").shouldHave(text("A"));
//        $("#column-a").shouldHave(text("B"));
        actions()
                .moveToElement($("#column-a"))
                .clickAndHold()
                .moveByOffset(300,200)
                .release()
                .perform();
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }
}
