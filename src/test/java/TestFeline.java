import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Must return \"Животные\", \"Птицы\", \"Рыба\"",
                expectedList, feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        String expectedFamily = "Кошачьи";
        assertEquals("Must return \"Кошачьи\"", expectedFamily, feline.getFamily());
    }

    @Test
    public void testGetKittensWithArgument() {
        when(feline.getKittens(1)).thenReturn(1);
        int expectedKitten = 1;
        assertEquals("Must return 1 kitten", expectedKitten, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        int expectedKittens = 3;
        assertEquals("Must return 3 kittens", expectedKittens, feline.getKittens(3));
    }
}
