package orchestra;

import instruments.Instrument;
import interfaces.IConcert;

import java.util.ArrayList;
import java.util.List;

public class Concert implements IConcert{
    private final ArrayList<Object> concerts;
    private String name;
    private List<Instrument> instruments;
    private Orchestra orchestra;


    public Concert (String name){
        this.name = name;
        this.instruments = new ArrayList<>();
        this.concerts = new ArrayList<>();
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setConcertPerformers(List<Instrument> concertPerformers) {
        this.instruments = concertPerformers;
    }

    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);

    }

    public void removeInstrument(Instrument instrument) {
        this.instruments.remove(instrument);
    }
}
