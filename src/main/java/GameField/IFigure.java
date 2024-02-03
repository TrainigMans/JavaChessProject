package GameField;

import java.util.Optional;

public interface IFigure {
    public FigureStatus getStatus();
    public Optional<FieldCellID> getCellID();
    public FigureSide getSide();
    public void setCellId(Optional<FieldCellID> id);
}

