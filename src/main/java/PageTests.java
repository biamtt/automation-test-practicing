import manager.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AbstractPage;
import pages.PageElements;

public class PageTests extends BaseTest {

    PageElements pageElements = new PageElements();

    @Test
    void test() {
        pageElements.acceptCookies();
        pageElements.clickWeatherData();
        pageElements.typeCity("Tallinn");
        pageElements.clickSearch();

        Assertions.assertTrue(pageElements.locationValidatePresence());
        Assertions.assertEquals(pageElements.locationValidation(), "Tallinn");
    }
}
