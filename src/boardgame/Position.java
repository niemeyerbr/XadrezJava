package boardgame;

public class Position {
    //attributes
    private int row, columm;

    //methods


    public Position(int row, int columm) {
        this.row = row;
        this.columm = columm;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumm(int columm) {
        this.columm = columm;
    }

    @Override
    public String toString(){
        return row + "," + columm;
    }
}
