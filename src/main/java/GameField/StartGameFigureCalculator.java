package GameField;

import java.util.Optional;

public class StartGameFigureCalculator implements IStartGameFigureCalculator {

    @Override
    public Optional<IFigure> calculateFor(FieldCellID cellId) {

        Optional<IFigure> result = Optional.empty();

        switch (cellId) {
            case A1, H1 -> result = Optional.of(Figure.make(FigureStatus.ROOK, FigureSide.WHITE));
            case B1, G1 -> result = Optional.of(Figure.make(FigureStatus.KNIGHT, FigureSide.WHITE));
            case C1, F1 -> result = Optional.of(Figure.make(FigureStatus.BISHOP, FigureSide.WHITE));
            case D1 -> result = Optional.of(Figure.make(FigureStatus.QUEEN, FigureSide.WHITE));
            case E1 -> result = Optional.of(Figure.make(FigureStatus.KING, FigureSide.WHITE));
            case A2, B2, C2, D2, E2, F2, G2, H2, A8, H8 -> result = Optional.of(Figure.make(FigureStatus.ROOK, FigureSide.BLACK));
            case B8, G8 -> result = Optional.of(Figure.make(FigureStatus.KNIGHT, FigureSide.BLACK));
            case C8, F8 -> result = Optional.of(Figure.make(FigureStatus.BISHOP, FigureSide.BLACK));
            case D8 -> result = Optional.of(Figure.make(FigureStatus.QUEEN, FigureSide.BLACK));
            case E8 -> result = Optional.of(Figure.make(FigureStatus.KING, FigureSide.BLACK));
            case A7, B7, C7, D7, E7, F7, G7, H7 -> result = Optional.of(Figure.make(FigureStatus.PAWN, FigureSide.BLACK));
            default -> { }
        }

        return result;
    }
}


