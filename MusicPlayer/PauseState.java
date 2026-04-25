public class PauseState extends MPState {

	private static PauseState instance;

	private PauseState() {
	}

	@Override
	public void handleInput(Player.UserInputType input) {
		switch (input) {
			case Play:
				owner.changeState(PlayState.getInstance());
				break;
			case Stop:
				owner.changeState(StopState.getInstance());
				break;
			case Skip:
				PlayState.getInstance().PlayNext();
				owner.changeState(PlayState.getInstance());
				break;
			case Pause:
			default:
				break;
		}
	}

	public static PauseState getInstance() {
		if (instance == null) {
			instance = new PauseState();
		}
		return instance;
	}
}
