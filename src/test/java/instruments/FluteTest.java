package instruments;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FluteTest {
    Flute flute;

    @BeforeEach
    public void setUp(){
        flute = new Flute("flutist", true);
    }


    @Test
    public void canAddFlutePart() {
        String expected = "your flute part is 1";
        String actual = flute.flutePart("" ,+ 1);
        assertThat(actual).isEqualTo(expected);
    }


}
