import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAnimalGetFood {

    private Animal animal;
    private String animalKind;
    private List<String> expectedList;

    public TestAnimalGetFood(String animalKind, List<String> expectedList) {
        this.animalKind = animalKind;
        this.expectedList = expectedList;
    }

    @Parameterized.Parameters
    public static Object[][] getKind() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void testGetFood() throws Exception {
            animal = new Animal();
            assertEquals(expectedList, animal.getFood(animalKind));
    }
}
