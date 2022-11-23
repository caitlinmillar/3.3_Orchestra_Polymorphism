package instruments;

import java.util.List;

public class Trumpet extends Instrument{
    private String getNameOfPiece;

    public Trumpet(String name, String typeOfInstrument) {
        super(name, false);
        this.getTypeOfInstrument = "Brass";
    }

    @Override
    public String getNameOfPiece() {
        return "Serenade to Music by Vaughan Williams";
    }
}
