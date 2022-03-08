/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Reviews;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void ShopTest(){
        Shop sh = new Shop("Alwaan","Library for School stationery","$$$");
        String expected = "Shop{name='Alwaan', description='Library for School stationery', numDollar='$$$'}";
        assertEquals(expected, sh.toString());
    }

    @Test void Rate(){
        Restaurant Indiana = new Restaurant("Indiana",4,"200","Delicious");
        Review R1 = new Restaurant(Indiana);
        Indiana.addReview(R1);
        double num = 4.5;
        assertEquals(num, R1.RateStar);
    }
    @Test void TheaterTest(){
        Theater Comedy = new Theater("Comedy","Zakki-chan");
        Comedy.addMovie("Mdrset Al Mushaghbeen");
        Comedy.removeMovie("Zakki-chan");
        String str="Theater{name='Comedy', movies=[Mdrset Al Mushaghbeen], Total=5.0}";
        assertEquals(str,Comedy.toString());
    }
    @Test void TheaterRateTest(){

        Theater Comdey = new Theater("Comedy","Zakki-chan");
        Review R1 = new Theater(Comdey,3,"Zakki-chan","Great Movie");
        Comdey.addReview(R1);
        double num = 4;
        assertEquals(num, R1.RateStar);

    }
    @Test void check(){
        Theater Comedy = new Theater("Comedy","Zakki-chan");
        Review R3 = new Theater(Comedy,4,"Zakki-chan","Great");
        String str2 = "Theater{name='Comedy', movies=[Zakki-chan], Total=4.5}";
        Comedy.addReview(R3);
        assertEquals(str2, R3.toString());

    }

    @Test void checkTheaterWithoutMovieName(){
        Theater Comedy = new Theater("Comedy","Zakki-chan");
        Review R3 = new Theater(Comedy,4,"Great");
        String str2 = "Theater{name='Comedy', Total=4.5}";
        Comedy.addReview(R3);
        assertEquals(str2, R3.toString());

    }
}
