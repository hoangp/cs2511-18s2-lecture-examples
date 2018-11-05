package pattern.command.example1;
// A client to use the Invoker
public class Client {
	public static void main(String[] args) {
	
	//Instantiate the invoker
	RemoteControl control = new RemoteControl();
	
	//Intantiate the receiver
	Light light = new Light();
	Command lightsOn = new LightOnCommand(light);
	Command lightsOff = new LightOffCommand(light);
	
	//switch on
	control.setCommand(lightsOn);
    //control.pressButton();
    //switch off
    control.setCommand(lightsOff);
    control.pressButton();
   }
}
