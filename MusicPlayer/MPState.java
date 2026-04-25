public abstract class MPState { // Music Player State
	protected Player owner;

	public void enter() {
	}

	public void exit() {
	}

	public void update() {
	}

	public void handleInput(Player.UserInputType input) {
	}

	public void setOwner(Player mp) {
		this.owner = mp;
	}
}
