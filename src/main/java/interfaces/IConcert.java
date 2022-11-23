package interfaces;

import instruments.Instrument;

import java.util.List;

public interface IConcert {
    public List<Instrument> getInstruments();
    public void addInstrument (Instrument instrument);
    public void removeInstrument (Instrument instrument);


}
