package pattern.command.example1;

//Concrete command class for turning on and off a light
//Must provide a method execute() to invoke the action on the Receiver
//Must store a reference to the receiver
public class LightOnCommand implements Command {

	// A reference to the receiver object
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		// Triggers the appropriate action on the receiver
		light.switchOn();
	}

}
