import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCat {



    @Test
    public void CatTester() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(cat.getSound(), "Мяу");
        assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));

    }
}
