import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    private Lion lion;

    @Mock
    Feline feline;


    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void testGetKittens() {
        when(feline.getKittens()).thenReturn(1);
        int expectedKitten = 1;
        assertEquals("Must be 1 kitten", expectedKitten, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedListFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals("Must return list: " + expectedListFood, expectedListFood, lion.getFood());
    }
}

