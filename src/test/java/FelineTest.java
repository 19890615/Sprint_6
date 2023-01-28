import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void felineTester() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();

//        feline.getFamily();
//        Mockito.verify(feline).getFamily();
//        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
//        assertEquals(feline.getFamily(), "Кошачьи");
//
//        Feline fel2 = new Feline();
//        assertEquals(fel2.getFamily(), "Кошачьи");

    }
}
