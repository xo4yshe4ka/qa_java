import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionDoesHaveMane {

    private Feline feline;
    private String sex;
    private boolean expectedHasMane;

    public TestLionDoesHaveMane(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLion() {
        return new Object[][] {
            {"Самец", true},
            {"Самка", false},
            {"Небинарный", false}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(expectedHasMane, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
