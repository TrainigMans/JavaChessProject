package GameField;

import java.util.Optional;

public class Figure implements IFigure {

    private FigureStatus status;
    private FigureSide side;
    private Optional<FieldCellID> cellID = Optional.empty();


    public void initialize(FigureStatus status, FigureSide side) {
        this.status = status;
        this.side = side;
    }

    static public Figure make(FigureStatus status, FigureSide side) {
        Figure figure = new Figure();
        figure.initialize(status, side);
        return figure;
    }

    @java.lang.Override
    public FigureStatus getStatus() {
        return status;
    }

    @java.lang.Override
    public Optional<FieldCellID> getCellID() {
        return cellID;
    }

    @Override
    public void setCellId(Optional<FieldCellID> id) {
        this.cellID = id;
    }

    @Override
    public FigureSide getSide() {
        return side;
    }
}
