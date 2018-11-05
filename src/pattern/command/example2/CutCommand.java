package pattern.command.example2;
import javafx.scene.control.IndexRange;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (getTextField().getSelectedText().isEmpty()) return false;

        backup();
        setClipboard(getTextField().getSelectedText());

        IndexRange selection = getTextField().getSelection();
        getTextField().deleteText(selection.getStart(), selection.getEnd());
        return true;
    }

}