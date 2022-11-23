package instruments;

import java.util.List;

public class Violin extends Instrument {


    public Violin(String name, String nameOfPiece) {
        super(name, Boolean.valueOf(nameOfPiece));
        this.getTypeOfInstrument = "Strings";
    }

    public String nameOfPiece() {
        return "Serenade to Music by Vaughan Williams";
    }

    public String getNameOfPiece() {
        return null;
    }
}
