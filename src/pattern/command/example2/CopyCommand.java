package pattern.command.example2;
// A concrete command class that extends the Command abstract class
public class CopyCommand extends Command {

	 // The constructor is passed the specific receiver object 
    // that receives the command request
    public CopyCommand(Editor editor) {
        super(editor);
    }

    // The execute method calls the getTextField() on the receiving object (Editor)
    // to get the contents
    @Override
    public boolean execute() {
        String selectedText = getTextField().getSelectedText();
        setClipboard(selectedText);
        return false;
    }
}
