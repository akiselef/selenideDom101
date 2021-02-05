import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPageTest {
    @Test
    void softAssertionsTest() {
        open("https://github.com/selenide/selenide");
        $("[data-tab-item=i4wiki-tab]").click();
        $x("//a[text()='SoftAssertions']").shouldBe(visible);
        $x("//a[text()='SoftAssertions']").click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
