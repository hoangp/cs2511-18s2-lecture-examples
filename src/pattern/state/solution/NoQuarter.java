package pattern.state.solution;

public class NoQuarter implements State {
	private GumBallMachine gumBall;
	
	public NoQuarter(GumBallMachine g) {
		this.gumBall = g;
	}
	
	@Override
	public void insertQuarter() {
		// This is a valid action. We can transition to the next state
		System.out.println("You inserted a quarter. Turn the crank to get a gumball");
		gumBall.setState(gumBall.getHasQuarter());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");

	}

}
