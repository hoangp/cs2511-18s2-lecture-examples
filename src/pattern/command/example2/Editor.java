package pattern.command.example2;

import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Editor {
    
    private Stack<Command> history;
    
    private String clipboard;

    @FXML
    private TextArea textField;
    
    public Editor() {
        history = new Stack<Command>();
        clipboard = "";
    }

    @FXML
    void copyButton(ActionEvent event) {
        executeCommand(new CopyCommand(this));
    }

    @FXML
    void cutButton(ActionEvent event) {
        executeCommand(new CutCommand(this));
    }

    @FXML
    void pasteButton(ActionEvent event) {
        executeCommand(new PasteCommand(this));
    }

    @FXML
    void undoButton(ActionEvent event) {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
    
    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public TextArea getTextField() {
        return textField;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

}
