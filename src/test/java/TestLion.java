import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith (Parameterized.class)
public class TestLion {

    private final String sex;
    private final Boolean mane;

    public TestLion(String sex, Boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParameters() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
                {"Другой", true}
        };
    }

    @Test
    public void lionTester() throws Exception {
        Feline family = new Feline();
        try {
            Lion lion = new Lion(sex, family);
            assertEquals(lion.doesHaveMane(), mane);
            assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
            assertEquals(lion.getKittens(), 1);
        } catch (Exception exception){
            assertEquals(exception.getMessage(), "Используйте допустимые значения пола животного - самец или самка");
        }


    }

}
