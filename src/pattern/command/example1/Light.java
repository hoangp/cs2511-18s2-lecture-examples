package pattern.command.example1;

// Receiver class that performs the action
public class Light {

	private boolean state;
	// Actions on the light object (Receiver)
	public void switchOn(){
	    state = true;
	  }
	public void switchOff(){
	    state = false;
	  }
}
