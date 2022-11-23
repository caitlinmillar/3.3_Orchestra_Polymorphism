package orchestra;
import instruments.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCollection;

public class ConcertTest {
    Concert concert;
    Orchestra orchestra;
    Instrument instrument;
    private Violin violin;
    private Trumpet trumpet;
    private Flute flute;

    @BeforeEach
    public void setUp() {
        concert = new Concert("Celebration for Vaughan Williams 150th Birthday");
        orchestra = new Orchestra("Bedford Choral Society & Bedford Symphony Orchestra", false);
        concert.addInstrument(trumpet = new Trumpet("Trumpet player", "Brass"));
        concert.addInstrument(violin = new Violin("Violin player", "Hodie by Vaughan Williams"));
        concert.addInstrument(flute = new Flute("flutist", true));

    }

    @Test
    public void canAddInstruments(){
        assertThat(concert.getInstruments().size()).isEqualTo(3);
    }

    @Test
    public void canRemoveInstruments(){
        concert.removeInstrument(trumpet);
        assertThat(concert.getInstruments().size()).isEqualTo(2);
    }


}
