public class PlayState extends MPState {

	private final long deltaTime = 1;
	private final long songLength = 100;

	private static PlayState instance;

	private PlayState() {
	}

	public static PlayState getInstance() {
		if (instance == null) {
			instance = new PlayState();
		}
		return instance;
	}

	@Override
	public void enter() {
		if (owner.currSong.isEmpty()) {
			PlayNext();
		}
	}

	@Override
	public void update() {
		owner.currTime += deltaTime;
		if (owner.currTime >= songLength) {
			PlayNext();
		}
	}

	@Override
	public void handleInput(Player.UserInputType input) {
		switch (input) {
			case Pause:
				owner.changeState(PauseState.getInstance());
				break;
			case Stop:
				owner.changeState(StopState.getInstance());
				break;
			case Skip:
				PlayNext();
				break;
			case Play:
			default:
				break;
		}
	}

	private void PlaySong(String songName, long time) {
		owner.currSong = songName;
		owner.currTime = time;
	}

	public void PlayNext() {
		PlaySong(owner.pollSong(), 0);
	}
}
