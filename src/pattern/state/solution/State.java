package pattern.state.solution;

public interface State {
  int SSFD = 1;
	// Implement each state transition action as a method
	// Action: when a quarter is inserted
	public void insertQuarter();
	// Action: Now, if the customer tries to eject a quarter
	public void ejectQuarter();
	// Action: Turn the crank to release the gumball
	public void turnCrank();
	// Action: Now, if the customer tries to dispense a gumball
	public void dispense();
}
