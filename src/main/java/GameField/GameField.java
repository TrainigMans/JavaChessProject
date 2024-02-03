package GameField;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Optional;

public class GameField {

    private HashMap<FieldCell, Optional<IFigure>> field = new HashMap<>();
    private IStartGameFigureCalculator startGameFigureCalculator;

    public void initialize(IStartGameFigureCalculator startGameFigureCalculator) {
        this.startGameFigureCalculator = startGameFigureCalculator;
        makeInitialField();
    }

    private void makeInitialField() {
        ArrayList<FieldCellID> allCells = new ArrayList<>(EnumSet.allOf(FieldCellID.class));
        allCells.forEach(value -> {
            FieldCell cell = new FieldCell();
            cell.initialize(value);
            Optional<IFigure> figure = startGameFigureCalculator.calculateFor(value);
            field.put(cell, figure);
        });
    }
}

