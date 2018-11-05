package pattern.command.example1;
// The Invoker class
public class RemoteControl {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
		pressButton();
	}
	
	public void pressButton(){
	    command.execute();
	}
}
