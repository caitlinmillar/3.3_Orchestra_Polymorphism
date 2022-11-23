package orchestra;
import instruments.Instrument;
import instruments.Woodwind;

import java.util.ArrayList;

public class Orchestra {
    private String name;
    private ArrayList<Instrument> instruments;
    private Instrument trumpet;
    private Instrument violin;
    private Woodwind flute;

    public Orchestra(String name, boolean soloist){
       this.name = name;
       this.instruments = new ArrayList<>();
    }


    public String getName(){return name;}
    public void setName(String name) {
        this.name = name;}

    public ArrayList<Instrument> getInstruments() {
        return instruments;}
    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;}

    public int countInstruments(){
        return this.instruments.size();}
    public void addInstrument(Instrument instrument){
        this.instruments.add(instrument);}

    public Woodwind getFlute() {
        return flute;
    }

    public void setFlute(Woodwind flute) {
        this.flute = flute;
    }


}
