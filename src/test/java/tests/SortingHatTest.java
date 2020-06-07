package tests;

import api.SortingHatApi;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEqualsNoOrder;

public class SortingHatTest {
    Set<String> expectedHouses = Set.of("Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw");

    @Test
    public void test_getSortingHatResponse_confirmThereAre4HogwartsHousesReturned() {
        SortingHatApi hat = new SortingHatApi();

        Set<String> houses = new HashSet<String>();
        while(houses.size() <= 4){
            houses.add(hat.getHogwartsHouse().asString());
            if(houses.size() == 4){
                break;
            }
        }
        System.out.println(houses);
        assertThat(houses, iterableWithSize(4));
       
    }
}
