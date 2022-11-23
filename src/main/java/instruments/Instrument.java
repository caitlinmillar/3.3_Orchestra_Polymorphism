package instruments;

import orchestra.Orchestra;

import java.lang.reflect.Array;
import java.util.List;

public abstract class Instrument extends Orchestra {
    protected String getTypeOfInstrument;
    private String name;
    private String nameOfPiece;
    private final boolean soloist;
    private List<Instrument> typeOfInstrument;

    public Instrument(String name, Boolean soloist){
        super(name, false);
        this.name = name;
        this.soloist = soloist;
        String[] typeOfInstrument = {"Brass", "Woodwind", "Strings"};

    }


    public List<Instrument> getTypeOfInstrument() {
        return typeOfInstrument;}

    public void setTypeOfInstrument(List<Instrument> typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfPiece(){ return nameOfPiece; }

    public void setNameOfPiece(String nameOfPiece) {
        this.nameOfPiece = nameOfPiece;
    }

    public boolean isSoloist() {
        return soloist;
    }
    public boolean setSoloist() {
        return soloist;
    }

    public List<Instrument> typeOfInstrument() {
        return typeOfInstrument;
    }


    public void addInstrument(Woodwind woodwind) {
    }
}
