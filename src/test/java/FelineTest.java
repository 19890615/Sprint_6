import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void FelineTester() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        assertEquals(feline.getFamily(), "Кошачьи");

        Feline fel2 = new Feline();
        assertEquals(fel2.getFamily(), "Кошачьи");

    }
}
