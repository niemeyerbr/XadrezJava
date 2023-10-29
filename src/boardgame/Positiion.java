package boardgame;

public class Positiion {
    //attributes
    private int row, columm;

    //methods


    public Positiion(int row, int columm) {
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
