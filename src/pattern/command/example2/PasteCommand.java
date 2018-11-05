package pattern.command.example2;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (getClipboard().isEmpty()) return false;

        backup();
        int pos = getTextField().getCaretPosition();
        getTextField().insertText(pos, getClipboard());
        return true;
    }
}
