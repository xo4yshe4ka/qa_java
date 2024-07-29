import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAlexLion {

    private AlexLion alexLion;
    Feline feline;

    @Before
    public void setUp() throws Exception {
        alexLion = new AlexLion("Самец", feline);
    }

    @Test
    public void testGetKittens() {
        int expectedKitten = 0;
        assertEquals("Alex doesn't have kittens", expectedKitten, alexLion.getKittens());
    }

    @Test
    public void testGetFriends() {
        List<String> expectedListFriends = Arrays.asList("Marty", "Gloria", "Melman");
        assertEquals("Lion Alex has 3 friends: Marty, Gloria, Melman", expectedListFriends, alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() {
        String expectedPlaceLiving = "New York zoo";
        assertEquals("Alex lives at the New York zoo", expectedPlaceLiving, alexLion.getPlaceOfLiving());
    }
}
