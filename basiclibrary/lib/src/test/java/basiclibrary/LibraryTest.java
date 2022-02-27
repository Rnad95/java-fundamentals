/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");

    }
    
    @Test
    void roll(){
        Library funUnderTest = new Library();
        int[] testResult = funUnderTest.roll(4);
        assertEquals(4,testResult.length);
    }

    @Test
    void containsDuplicates(){
        Library funUnderTest = new Library();
        int[] arr = {1,2,3,4};
        boolean testResult = funUnderTest.containsDuplicates(arr);
        assertEquals(false,testResult);
    }

    @Test
    void  calculatingAverages(){
        Library classUnderTest = new Library();
        int[] arr = {1,2,3,4,5};
        double testResult = classUnderTest.calculatingAverages(arr);
        assertEquals(3.0,testResult);

    }

    @Test
    void  lowestAverage(){
        Library classUnderTest = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
         int[] arr = {55, 54, 60, 53, 59, 57, 61};
        int[] testResult = classUnderTest.lowestAverage(weeklyMonthTemperatures);

        String arr2 = Arrays.toString(arr);
        String arr3 = Arrays.toString(testResult);
        assertEquals(arr2,arr3);

    }

    @Test
    void analyzingWeatherData(){
        Library classUnderTest = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        ArrayList<String> arr = new ArrayList<>();
        arr.add("High: 72");
        arr.add("Low: 51");
        arr.add("Never saw temperature: 63");
        arr.add("Never saw temperature: 67");
        arr.add("Never saw temperature: 68");
        arr.add("Never saw temperature: 69");


        ArrayList<String> testResult = classUnderTest.analyzingWeatherData(weeklyMonthTemperatures);
        assertEquals(arr,testResult);

    }

    @Test
    void tally(){
        Library ClassUnderTest = new Library();
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String testResult = ClassUnderTest.tally(votes);
        assertEquals("Bush", testResult);

    }

}
