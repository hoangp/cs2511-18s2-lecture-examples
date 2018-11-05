package pattern.command.example2;
import javafx.scene.control.TextArea;

// The command interface
public abstract class Command {
	// The receiver of the command request
    private Editor editor;
    private String backup;

    // The constructor is passed the specific receiver object 
    // that receives the command request
    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = getTextField().getText();
    }

    public void undo() {
        getTextField().setText(backup);
    }

    public abstract boolean execute();

    public TextArea getTextField() {
        return editor.getTextField();
    }

    public void setClipboard(String text) {
        editor.setClipboard(text);
    }

    public String getClipboard() {
        return editor.getClipboard();
    }
}
