package GameField;

import java.util.Optional;

public interface IStartGameFigureCalculator {
    public Optional<FieldCellID> calculateFor(FieldCellID cellId);
}