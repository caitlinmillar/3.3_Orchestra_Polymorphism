package instruments;

public abstract class Woodwind extends Instrument {


    private String flutePart;

    public Woodwind(String name, Boolean soloist) {
        super(name, true);

    }


    public int getNumber(int number){return number;}
    public abstract String getNameOfPiece();
    public String getNameOfPiece(String nameOfPiece) {
        return String.format("Serenade to Music by Vaughan Williams");
    }



}
