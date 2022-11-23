package instruments;

public class Flute extends Woodwind {


    public Flute(String name, Boolean soloist) {
        super(name, soloist);

    }

    public String flutePart(String flutePart, int fluteNumber){
        return String.format("your flute part is ", + 1);
    }

    public String flutePart(){
        return String.format("your flute part is ", + 2);
    }


    @Override
    public String getNameOfPiece() {
        String nameOfPiece;
        return "The Kingdom by Elgar";
    }

    @Override
    public boolean isSoloist() {
        boolean isSoloist;
        return isSoloist = true;
    }



}
