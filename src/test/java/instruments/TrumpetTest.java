package instruments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import instruments.*;

public class TrumpetTest<TypeOfInstrument> {
    private Trumpet trumpet;
    List Brass;

    @BeforeEach
    public void setUp() {
        trumpet = new Trumpet("Trumpet 1",  "Brass");

    }

    @Test
    public void nameOfPiece(){
        assertThat(trumpet.getNameOfPiece()).isEqualTo("Serenade to Music by Vaughan Williams");
    }

    @Test
    public void testTypeOfInstrument(){
        assertThat(trumpet.getTypeOfInstrument()).isEqualTo(Brass);

    }



}