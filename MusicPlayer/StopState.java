public class StopState extends MPState {
	private static StopState instance;

	private StopState() {
	}

	public static StopState getInstance() {
		if (instance == null) {
			instance = new StopState();
		}
		return instance;
	}

	private void endPlayback() {
		owner.currSong = "";
		owner.currTime = 0;
	}

	@Override
	public void enter() {
		endPlayback();
	}

	@Override
	public void handleInput(Player.UserInputType input) {
		switch (input) {
			case Play:
				owner.changeState(PlayState.getInstance());
				break;
			case Stop:
			case Skip:
			case Pause:
			default:
				break;
		}

	}
}
