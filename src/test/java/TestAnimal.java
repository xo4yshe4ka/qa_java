import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestAnimal {

    private Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void testGetFamily() {
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals("Должно вернуться: " + expectedMessage, expectedMessage, animal.getFamily());
    }

    @Test
    public void testGetFoodException() throws Exception {
        try {
            animal.getFood("Солнцеед");
            fail("Тест должен был выбросить исключение");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}
