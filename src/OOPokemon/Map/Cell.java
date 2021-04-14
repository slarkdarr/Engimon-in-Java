package OOPokemon.Map;

import OOPokemon.GameState;
import OOPokemon.Occupier.Occupier;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell extends Rectangle {
    public Position position;
    private final CellType cellType;
    public Occupier occupier;

    // Configuration parameter
    public static float cellWidth = GameState.getCellWidth();
    public static float cellHeight = GameState.getCellHeight();


    Cell() {
        super(0,0, cellWidth, cellHeight);
        position = new Position();
        cellType = CellType.Grassland_Cell;
        setFill(Color.LAWNGREEN);
        occupier = null;
    }

    Cell(int x, int y, CellType cellType) {
        super(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
        position = new Position(x,y);
        this.cellType = cellType;
        switch (cellType){
            case Grassland_Cell:
                setFill(Color.LAWNGREEN);
                break;
            case Sea_Cell:
                setFill(Color.ROYALBLUE);
                break;
            case Mountain_Cell:
                setFill(Color.valueOf("#FF8F0C"));
                break;
            case Tundra_Cell:
                setFill(Color.valueOf("#C5DDFA"));
                break;

        }
        occupier = null;
    }

    public void setOccupier(Occupier occupier) {
        this.occupier = occupier;
    }
}
