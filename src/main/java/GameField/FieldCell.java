package GameField;

public class FieldCell implements IFieldCell {

    private FieldCellID id;

    public void initialize(FieldCellID id) {
        this.id = id;
    }

    @Override
    public FieldCellID getId() {
        return id;
    }
}
