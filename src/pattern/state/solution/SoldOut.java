package pattern.state.solution;

public class SoldOut implements State {

	private GumBallMachine gumBallMachine;
	public SoldOut(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	// insertQuarter(), ejectQuarter() and turnCrank() are all invalid actions for this state
	@Override
	public void insertQuarter() {
		System.out.println("You cannot insert another quarter, machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You cannot eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You cannot turn the crank, machine is sold out");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed, machine is sold out");
	}
}
