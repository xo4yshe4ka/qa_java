import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnimalGetFamily {

    private Animal animal;

    @Test
    public void testGetFamily() {
        animal = new Animal();
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals("Должно вернуться: " + expectedMessage, expectedMessage, animal.getFamily());
    }
}
