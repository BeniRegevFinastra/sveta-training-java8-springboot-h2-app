package conditionCheck;

public class BracketObj {

    public Character getBracket() {
        return bracket;
    }

    public BracketObj(Character bracket, int index) {
        this.bracket = bracket;
        this.index = index;
    }

    public void setBracket(Character bracket) {
        this.bracket = bracket;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private Character bracket;
    private int index;
}
