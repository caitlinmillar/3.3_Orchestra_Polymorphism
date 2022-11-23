package orchestra;


import instruments.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrchestraTest {
    private Orchestra orchestra;
    private Orchestra flute;
    private Orchestra trumpet;
    private Orchestra violin;

    @BeforeEach
    public void setUp(){
        orchestra = new Orchestra("Philharmonic Orchestra", false);
        flute = new Orchestra("flute", true);
        trumpet = new Orchestra("trumpet", false);
        violin = new Orchestra("violin", false);
    }

    @Test
    public void canCountInstruments(){
        int expected = 0;
        int actual = orchestra.countInstruments();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddInstruments(){

        orchestra.addInstrument(flute.getFlute());
        int expected = 1;
        int actual = orchestra.countInstruments();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMultipleInstruments(){
        Instrument trumpet = new Trumpet("Trumpet 1", "Brass");
        Instrument violin = new Violin("Violin 1", "Serenade to Music by Vaughan Williams");
        orchestra.addInstrument(trumpet);
        orchestra.addInstrument(violin);
        assertEquals(2, orchestra.countInstruments());
    }








}